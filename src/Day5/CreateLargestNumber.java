package Day5;

import java.util.Arrays;

public class CreateLargestNumber {
    public static void main(String[] args) {
        int[] num = {23,34,55};
        String ans = "";
        Arrays.toString(num);

        for (int i= num.length-1; i >=0; i--) {
            ans+= num[i];
        }

        System.out.println(ans);
    }
}
