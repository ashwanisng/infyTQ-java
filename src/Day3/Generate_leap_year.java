package Day3;

import java.util.ArrayList;

public class Generate_leap_year {
    public static void main(String[] args) {
        int year = 2000;
        ArrayList<Integer> leap_year = new ArrayList<>();
        for (int i=0; i<15; i++) {
            leap_year.add(year=year+4);
        }

        for (int i : leap_year) {
            System.out.println(i);
        }
    }
}
