package Day7;

public class SMS_Encoding {

    public void encode_sentence(String str) {
        String[] words = str.split(" ");
        String sms = "";
        for (int i=0; i<words.length; i++) {
            String word = words[i];

            for (int j=0; j<word.length(); j++) {
                if (word.charAt(j) == 'a' || word.charAt(j) == 'e'
                || word.charAt(j) == 'i' || word.charAt(j) == 'o'||
                word.charAt(j) =='u') {
                    continue;
                }else {
                    sms += word.charAt(j);
                }
            }

            sms += " ";
        }
        System.out.println(str);
        System.out.println(sms);
    }
    public static void main(String[] args) {
        SMS_Encoding sms_encoding = new SMS_Encoding();
        sms_encoding.encode_sentence("I love Python");
    }
}
