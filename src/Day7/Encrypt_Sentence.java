package Day7;

import java.util.stream.IntStream;

public class Encrypt_Sentence {
    public void reverse_Words(String str) {
        String[] words = str.split(" ");
        String reverseWord = "";

        for (int i=0; i< words.length; i++) {
            String curr = words[i];
            for (int j=curr.length()-1; j>=0; j--) {
                reverseWord += curr.charAt(j);
            }
            reverseWord += " ";
        }
        System.out.println(str);
        System.out.println(reverseWord);
    }
    public static void main(String[] args) {
        Encrypt_Sentence encrypt_sentence = new Encrypt_Sentence();

        encrypt_sentence.reverse_Words("the sun rises in the east");
    }
}
