package Day1;

import java.util.Scanner;

public class CalculateFare {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0) {
            int mileage = sc.nextInt();
            int amount = sc.nextInt();
            int distance = sc.nextInt();
            boolean per_head_cost = false;

            int cost = (((distance*2)/mileage)*amount)/4;

            if (cost % 5 ==0) {
                per_head_cost = true;
            }

            System.out.println(cost + " " + per_head_cost);
        }
    }
}
