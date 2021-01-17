package Day6;

import java.util.ArrayList;

public class Print_SubString {
    public static void main(String[] args) {
        String s = "3523014";
        int n = s.length();

        ArrayList<String> temp = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();




        for (int i=0; i<n; i++) {
            for (int j=i+1; j<=n; j++) {
                temp.add(s.substring(i,j));
            }
        }

        for (int i=0; i<temp.size(); i++) {
        }


        for (String i: temp) {
            System.out.print(i +" ");
        }
    }
}
