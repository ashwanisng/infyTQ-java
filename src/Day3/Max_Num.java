package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Max_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();


            ArrayList<Integer> ans = new ArrayList<>();
            int count = 0, sum =0;

            if (num1 > num2) {
                System.out.println("Not possible");
            }else {
                for (int i=num1; i<=num2; i++) {
                    while (i >0){
                        int r = i%10;
                        sum += r;


                        if (sum%3 ==0){
                            if (i%5 == 0){
                                ans.add(i);
                            }
                        }

                        i = i/10;
                        count++;
                    }
                    if (count ==2) {
                        ans.add(i);
                    }


                }
            }

            for (int i : ans) {
                System.out.print(i +" ");
            }
        }
    }
}
