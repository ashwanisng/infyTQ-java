package Day2;

import java.util.Scanner;

public class SalaryHike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int new_salary = 0;
        while (t-- > 0) {
            int jobLevel = sc.nextInt();

            int current_salary = 15000;


            if (jobLevel == 3) {
                new_salary = current_salary + ((15*current_salary)/100);
            } else if (jobLevel == 4) {
                new_salary = current_salary + ((7 * current_salary)/100);
            } else if (jobLevel == 5) {
                new_salary = current_salary + ((5 * current_salary)/100);
            } else {
                new_salary = current_salary;
            }
        }

        System.out.println("new salary is " + new_salary);

    }
}
