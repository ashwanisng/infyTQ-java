package Day4;

import java.util.Scanner;

public class CalculateFare {

    public static int calculate(int distance, int passenger_num){
        int fuel = 70;
        int mileage = 10;
        int price = 80;
        int expenses = (distance/mileage) * fuel;

        int income = passenger_num * price;

        if (income > expenses) {
            return income;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        int distance = sc.nextInt();
        int passenger = sc.nextInt();

        System.out.println(calculate(distance,passenger));

    }
}
