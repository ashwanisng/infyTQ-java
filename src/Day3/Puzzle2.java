package Day3;

import java.util.Scanner;

public class Puzzle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int chicken_Count = 0, rabbit_count = 0;

        while (t-- >0) {
            int head = sc.nextInt();
            int legs = sc.nextInt();


            if (legs % 2==0) {
                rabbit_count = (legs/2) - head;
                chicken_Count = head - rabbit_count;

                System.out.println("No. of chicken " + chicken_Count + " and no. of rabbit are " + rabbit_count);

            }else {
                System.out.println("No solution");
            }

        }
    }
}
