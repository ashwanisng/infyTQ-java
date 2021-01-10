package Day4;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(String s) {
        int i= 0;
        int j= s.length()-1;

        while (j>i) {
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isPalindrome(s));
    }
}
