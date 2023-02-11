import java.util.HashMap;
import java.util.Scanner;

public class TestHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> var = new HashMap<>();

        var.put("Giovanni", 19);
        var.put("Gennaro", 18);
        var.put("Morena", 15);
        var.put("Arianna", 44);

        System.out.println(var);

        var.replace("Gennaro" ,18, 19);
        var.replace("Giovanni", 19, 20);



        System.out.println(var);


    }
}
