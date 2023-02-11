import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1, "Gionni");
        map.put(34, "banana");
        map.put(12, "Albicocche");

        System.out.println(map.containsKey("Banana".toLowerCase()));

        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()){

            Map.Entry<Integer, String> e = it.next();
            System.out.println("There are " + e.getKey() + " "+ e.getValue());
        }


    }

}
