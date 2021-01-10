package Day2;

import java.util.Scanner;

public class FoodCorner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String food = sc.nextLine();
        int quantity = sc.nextInt();
        int distance = sc.nextInt();

        int food_bill = 0;
        int delivery = 0;
        int total = 0;


        if (food.equals("V")) {
            food_bill = quantity * 120;
        }
        if (food.equals("N")) {
            food_bill = quantity * 150;
        }

        if (distance <3 ) {
            delivery = 0;
        }

        if (distance >3 && distance <=6) {
            distance = distance-3;
            while (distance > 0) {
                delivery += 3;
                distance--;

            }
        }

        if (distance > 6) {
            delivery = 9;
            distance = distance-3;
            while (distance >0){
                delivery +=6;
                distance--;
            }
        }

        total = food_bill + delivery;
        System.out.println(total);

    }
}
