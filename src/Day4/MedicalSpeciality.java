package Day4;

import java.util.Scanner;

public class MedicalSpeciality {
    public static void main(String[] args) {
        String[] s = {"101","P","102","O","302","P","305","P"};

        int n = s.length;
        int count_p =0;
        int count_o =0;
        int count_e =0;

        for (int i=0; i<n; i++) {
            if (s[i] == "P") {
                count_p++;
            }else if (s[i] == "O"){
                count_o++;
            }else if (s[i] == "E") {
                count_e++;
            }
        }

        if (count_p > count_e && count_p > count_o) {
            System.out.println("Pediatrics");
        }else if (count_e > count_p && count_e > count_o) {
            System.out.println("Ent");
        }else {
            System.out.println("Orthopedics");
        }
    }
}
