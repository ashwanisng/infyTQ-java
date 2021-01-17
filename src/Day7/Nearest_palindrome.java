package Day7;

public class Nearest_palindrome {

    public static boolean isPalindrome(String s) {
        int l = 0;
        int f = s.length()-1;

        while (l < f) {
            if (s.charAt(l) != s.charAt(f)) {
                return false;
            }
            l++;
            f--;
        }
        return true;
    }

    public static void closestpalindrome(int num) {
        int Rnum = num+1;
        while (isPalindrome(Integer.toString(Rnum)) == false) {
            Rnum++;
        }

        System.out.println(Rnum);

    }

    public static void main(String[] args) {
        int num = 12300;

        closestpalindrome(num);
    }

}
