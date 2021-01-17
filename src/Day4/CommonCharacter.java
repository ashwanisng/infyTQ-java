package Day4;

import java.util.Scanner;

public class CommonCharacter {
    private static final int MAX_CHAR = 26;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String news1 = s1.replaceAll("\\s", "").toLowerCase();
        String news2 = s2.replaceAll("\\s", "").toLowerCase();

        int[] a1 = new int[26];
        int[] a2 = new int[26];


        for (int i=0; i<news1.length(); i++) {
            a1[news1.charAt(i) - 'a']+=1;
        }

        for (int i=0; i<news2.length(); i++) {
            a2[news2.charAt(i) - 'a']++;
        }



        for (int i=0; i<MAX_CHAR; i++) {
            if (a1[i] != 0 && a2[i] != 0) {
                for (int j=0; j<Math.max(a1[i],a2[i] ); j++) {
                    System.out.print((char)(i+'a'));
                }
            }
        }
    }
}
