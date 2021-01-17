package Day2;

import java.util.Scanner;

public class CurrencyCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextInt();
        sc.nextLine();
        String s=new String();
        s=sc.nextLine();

        if(s.equals("Euro"))
        {
            amount=(float)(amount)*0.01417;

        }
        if(s.equals("Canadian Dollar"))
        {
            amount=(float)(amount)* 	0.02027;

        }
        if(s.equals("Australian Dollar"))
        {
            amount=(float)(amount)* 	0.02140;

        }
        if(s.equals("British Pound"))
        {
            amount=(float)(amount)*0.0100;

        }

        System.out.println(amount);
    }
}
