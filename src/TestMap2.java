import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap2 {


    public static String[][] updateInventory(String[][] arr1, String[][] arr2) {
        Map<String, Integer> inventory = new HashMap<>();

        for (String[] item : arr1) {
            inventory.put(item[1], Integer.parseInt(item[0]));
        }


    }
}







    /*  public static void main(String[] args) {

        HashMap<Integer, String > inventoryStored = new HashMap <> ();
        HashMap<Integer, String>  freshDelivery = new HashMap<>();
        inventoryStored.put(2, "bananas");
        inventoryStored.put(42, "Apples");
        freshDelivery.put(3, "Beers");
        freshDelivery.put(19, "Madonne");
        freshDelivery.put(2, "Apples");


      /*  Iterator<Map.Entry <Integer, String>> it = inventoryStored.entrySet().iterator();
    /*    while (it.hasNext()){

            Map.Entry<Integer, String> e = it.next();
            System.out.println("Ci sono "+ e.getKey() + " " + e.getValue());



        for (Map.Entry<Integer, String> e : inventoryStored.entrySet()){

            System.out.println("key: " + e.getKey());
            System.out.println("Value: " + e.getValue());
        }

    }
    }*/

