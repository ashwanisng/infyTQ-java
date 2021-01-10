package Day2;

import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0) {
            int oneRsCoin = sc.nextInt();
            int fiveRsCoin = sc.nextInt();
            int amount = sc.nextInt();
            int fiveUsed = 0;
            int oneUsed = 0;

            while (amount > 0) {
                if (fiveRsCoin > 0) {
                    amount = amount - 5;
                    fiveRsCoin--;
                    fiveUsed++;
                }else if(oneRsCoin > 0) {
                    amount = amount - 1;
                    oneRsCoin--;
                    oneUsed++;
                }else {
                    if (amount !=0) {
                        System.out.println(-1);
                        break;
                    }
                }
            }
            if (amount ==0) {
                System.out.println("Five rs coin used "+
                        (fiveUsed) + " and One rs coin is used " + (oneUsed));
            }
        }
    }
}
