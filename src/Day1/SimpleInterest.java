package Day1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int v = sc.nextInt();

        while (v-- >0) {
            double p = sc.nextDouble();
            double r = sc.nextDouble();
            double t = sc.nextDouble();

            double interest =  ((p*r*t)/100);
            System.out.println(interest);

        }
    }
}
