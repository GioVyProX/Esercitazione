import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array2d {

    public static void main(String[] args) {


        //Goes input of the product's number stored
        System.out.println("Insert the number of products in inventory");
        int numberOfProductsInInventory;
        Scanner var = new Scanner(System.in);
        numberOfProductsInInventory = Integer.parseInt(var.nextLine());
        //Goes input of the fresh product's number, early come.
        System.out.println("Insert the number of fresh products");
        int numberOfTheFreshProducts;
        Scanner a = new Scanner(System.in);
        numberOfTheFreshProducts = Integer.parseInt(a.nextLine());

        int newNumberOfProducts = numberOfProductsInInventory * numberOfTheFreshProducts;

        //This variable set the number of "slots" in the 2dArray, so there is space only for Name and Number
        int b = 2;
        //Setted the 2d Arrays, first one for the Inventory, second for the products early arrived
        String[][]  inventoryStored = new String[numberOfProductsInInventory][b];
        String[][] freshImport = new String[numberOfTheFreshProducts][b];
        String[][] itemsAddedToOldStore = new String [newNumberOfProducts][b];

        //calling my function that compiles my arrays

         System.out.println("Insert product's name first, than its cost of the items already stored");
        arraysCompiler(inventoryStored, numberOfProductsInInventory);

        System.out.println("Insert product's name first, than its cost of the fresh products");
        arraysCompiler(freshImport, numberOfTheFreshProducts);

         System.out.println("Products already stored: " + Arrays.deepToString(inventoryStored));
         System.out.println(Arrays.deepToString(freshImport));

        int max = Math.max(numberOfProductsInInventory, numberOfTheFreshProducts);

        for (int k = 0; k < numberOfProductsInInventory+numberOfTheFreshProducts; k+=2) {

               int g = 0;
               int name = g++;

                  itemsAddedToOldStore[k][0] = inventoryStored[name][0];
                  itemsAddedToOldStore[k][1] = inventoryStored[name][1];


                         for (int j = 0; j < numberOfTheFreshProducts ; j++) {

                               if (String.valueOf(itemsAddedToOldStore[k][0]) != String.valueOf(freshImport[j][0])){

                                   itemsAddedToOldStore[k+1][0] = freshImport[name][0];
                                   itemsAddedToOldStore[k+1][1] = freshImport[name][1];


                               }else {

                                   itemsAddedToOldStore[k][1] = itemsAddedToOldStore[k][1] + freshImport[j][1];
                               }
                }

        }

        System.out.println();
        System.out.println(Arrays.deepToString(itemsAddedToOldStore));


    }

    //compiler function
    public static String[][] arraysCompiler (String[][] mat, Integer  products) {

        int b = 2;

        for (int i = 0; i < products ; i++) {
            System.out.println();
            for (int j = 0; j < b ; j++) {
                String in;
                Scanner var = new Scanner(System.in);
                in = var.nextLine();
                mat[i][j] = in;
            }
        }

        return mat;
    }
}
