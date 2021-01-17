package Day5;

import java.util.Arrays;

public class ReportCard {
    public static void main(String[] args) {
        int[] marks = {12,18,25,24,2,5,18,20,20,21};
        int n = marks.length;

//        find_more_than_average
        int sum =0;
        for (int i=0; i<n; i++) {
            sum+= marks[i];
        }

        int avg = sum/n;
        int more_than_avg = 0;

        for (int i=0; i<n; i++) {
            if (marks[i] > avg) {
                more_than_avg++;
            }
        }

        int percentage_more_than_avg_mark = (more_than_avg*100)/n;
        System.out.println(percentage_more_than_avg_mark);

//        generate_frequency

        int[] freq = new int[26];

        for (int i=0; i< marks.length; i++) {
            freq[marks[i]]++;
        }

        for(int i: freq) {
            System.out.print(i +" ");
        }

        System.out.println();

//        sort_marks

        Arrays.sort(marks);
        for(int i: marks) {
            System.out.print(i +" ");
        }
    }
}
