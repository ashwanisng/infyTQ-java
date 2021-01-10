package Day2;

import java.util.Scanner;

public class CurrencyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double new_amount = 0.0;
        while (t-->0) {

            String currency = sc.nextLine();
            sc.next();
            int amount = 3500;

            if (currency.equals("Euro")) {
                new_amount = amount * 0.01417;
            } else if (currency.equals("British Pound")){
                new_amount = amount * 0.0100;
            } else if (currency.equals("Australian Dollar")) {
                new_amount = amount * 0.02140;
            } else if (currency.equals("Canadian Dollar")) {
                new_amount = amount * 0.02027;
            } else {
                new_amount = -1;
            }
        }
        System.out.println(new_amount);
    }
}
