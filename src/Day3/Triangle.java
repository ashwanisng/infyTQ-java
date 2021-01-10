package Day3;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0) {
            int side1 = sc.nextInt();
            int side2 = sc.nextInt();
            int side3 = sc.nextInt();

            if (side1 >= (side2+side3) &&
                    (side2 >= (side1+side3))
            && (side3 >= (side2+side1)) &&(side1 !=0)&& (side2!=0) && (side3!=0)) {
                System.out.println("Triangle can't be formed");
            }else {
                System.out.println("Triangle can be formed");
            }
        }
    }
}
