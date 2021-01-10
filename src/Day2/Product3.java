package Day2;

import java.util.Scanner;

public class Product3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int product = 1;

        while (t-- >0) {
            int[] num = new int[3];
            int n = num.length;

            for (int i=0; i<n; i++) {
                num[i] = sc.nextInt();
            }

            for (int i=0; i<n; i++) {
                if (num[i] != 7) {
                    product *= num[i];

                }else if ((num[0] ==7)|| (num[1] == 7)){
                    product = (product* num[i])/7;
                }
                else if (num[2] == 7) {
                    product = -1;
                }
            }

            System.out.println(product);


        }

    }
}
