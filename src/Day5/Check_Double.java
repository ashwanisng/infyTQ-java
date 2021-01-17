package Day5;

import java.util.Arrays;

public class Check_Double {
    public static void main(String[] args) {
        int number = 125874;
        int new_num = 2*number;

        String s1 = String.valueOf(number);
        String s2 = String.valueOf(new_num);

        char[] temp_s1 = s1.toCharArray();
        Arrays.sort(temp_s1);

        char[] temp_s2 = s2.toCharArray();
        Arrays.sort(temp_s2);
        

        for (int i=0; i<temp_s1.length; i++) {
            if (temp_s1[i] == temp_s2[i]) {
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }


        System.out.println(new_num);
    }
}
