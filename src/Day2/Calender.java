package Day2;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0) {
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            if (month%2 ==0) {
                if (day <30) {
                    day++;
                    System.out.println(day+"-"+month+"-"+year);
                }
                if (day == 30) {
                    day = 1;
                    month++;
                    System.out.println(day+"-"+month+"-"+year);
                }
                if (day == 28) {
                    day = 1;
                    month++;
                    System.out.println(day+"-"+month+"-"+year);
                }
            }else {
                if (day <31) {
                    day++;
                    System.out.println(day+"-"+month+"-"+year);
                }
                if (day == 31) {
                    day = 1;
                    month++;
                    System.out.println(day+"-"+month+"-"+year);
                }
            }
        }
    }
}
