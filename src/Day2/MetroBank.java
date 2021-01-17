package Day2;

import java.util.Scanner;

public class MetroBank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int account_balance=sc.nextInt();
        int salary=sc.nextInt();
        int loan_amount_expected =sc.nextInt();
        int customer_emi_expected=sc.nextInt();
        sc.nextLine();
        String account_number=sc.nextLine();


        if(account_number.length()==4)
        {
            int accnum=Integer.parseInt(account_number);
            if(accnum/1000==1 && account_balance>100000)
            {
                if(loan_amount_expected<=7500000 && customer_emi_expected<=84 )
                {
                    System.out.println( "account_number"+" "+account_number+" "+"eligible");
                    System.out.println("loan amount"+" "+ loan_amount_expected+" "+" emi "+customer_emi_expected);
                }
            }

        }
        else {
            System.out.println("invalid input");
        }


    }
}
