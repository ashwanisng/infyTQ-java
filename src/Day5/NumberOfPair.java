package Day5;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfPair {
    public static void main(String[] args) {
        int sum= 9;


        int[] ar = {3,4,1,8,5,9,0,6};
//        int[] ar = {1,2,7,4,5,6,0,3};
        int n = ar.length;
        int count = 0;

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (ar[i] + ar[j] == sum) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
