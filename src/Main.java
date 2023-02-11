import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class Main {
    public static String [][] invetoryComparison(String [][] arr1, String[][] arr2) {

        HashMap<String, Integer> inventory = new HashMap<>();
        for(String[] item : arr1){

            inventory.put(item[1], Integer.parseInt(item[0]));
        }






    }

   /* public static String[][] inventoryUpdate (String[][] arr1, String[][] arr2) {
        Map<String, Integer> inventory = new HashMap<>();

        for (String[] item : arr1) {
            inventory.put(item[1], Integer.parseInt(item[0]));
        }


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (String.valueOf(arr1[j]).toLowerCase() == String.valueOf(arr2[j]).toLowerCase()) {


                    int varAppoggio = parseInt(String.valueOf(arr2[i]));
                    arr1[i][j] = arr1[parseInt(String.valueOf(i)) + varAppoggio][j];


                } else arr1[i][0] = arr2[j][0];
            }

        }

}
   */





}