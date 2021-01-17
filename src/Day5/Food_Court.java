package Day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Food_Court {

    public static void main(String[] args) {


        String[] menu = {"Veg Roll", "Noodles", "Fried Rice", "Soup"};
        int[] quantity_available = {2,200,250,3};

        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            String food_name = sc.next();
            int quant = sc.nextInt();
            int s = 0;

            for (int i = 0; i < menu.length; i++) {
                if (!menu[i].equals(food_name)) {
                    System.out.println("Food not available");
                } else {
                    System.out.println(food_name + " is available ");
                    s = i;
                }
            }

            for (int i=0; i<quantity_available.length; i++) {
                if (quantity_available[i] < quant ){
                    System.out.println("Out of stock");
                }else {
                    quantity_available[s] = quantity_available[s] - quant;
                }
            }
        }
    }
}
