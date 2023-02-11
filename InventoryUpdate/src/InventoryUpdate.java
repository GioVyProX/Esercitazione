import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class InventoryUpdate {
    public static void main(String[] args) {

        HashMap<Integer, String > inventoryStored = new HashMap <> ();
        HashMap<Integer, String>  freshDelivery = new HashMap<>();
        inventoryStored.put(2, "bananas");
        inventoryStored.put(42, "Apples");
        freshDelivery.put(3, "Beers");
        freshDelivery.put(19, "Madonne");
        freshDelivery.put(2, "Apples");


    }
    public static String[][] updateInventory(String[][] arr1, String[][] arr2) {
        Map<String, Integer> inventory = new HashMap<>();

        for (String[] item : arr1) {
            inventory.put(item[1], Integer.parseInt(item[0]));
        }

        for (String[] delivery : arr2) {
            String itemName = delivery[1];
            int itemCount = Integer.parseInt(delivery[0]);

            if (inventory.containsKey(itemName)) {
                inventory.put(itemName, inventory.get(itemName) + itemCount);
            } else {
                inventory.put(itemName, itemCount);
            }
        }

        ArrayList<String[]> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            result.add(new String[] { Integer.toString(entry.getValue()), entry.getKey() });
        }

        Collections.sort(result, (a, b) -> a[1].compareTo(b[1]));

        return result.toArray(new String[result.size()][]);
    }
}
