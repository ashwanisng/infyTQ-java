package Day2;

import java.util.Scanner;

public class MetroBank {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String account_number = sc.nextLine();
            int account_balance = sc.nextInt();
            int salary = sc.nextInt();
            int loan_amount_expected = sc.nextInt();
            int customer_emi_expected = sc.nextInt();
            String loan_type = sc.nextLine();

            if (account_number.length() == 4) {
                int acc_num = Integer.parseInt(account_number);

                if (acc_num / 1000 == 1 && account_balance > 100000) {

                }
            }
        }
    }
}
