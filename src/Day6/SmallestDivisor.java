package Day6;

import java.util.Scanner;

public class SmallestDivisor {
    private static final int MAX = 1000001;

    // array to store prime factors
    private static final int[] factor = new int [MAX];

    // function to generate all prime factors
    // of numbers from 1 to 10^6
    public static void generatePrimeFactors()
    {
        factor[1] = 1;

        // Initializes all the positions
        // with their value.
        for (int i = 2; i < MAX; i++)
            factor[i] = i;

        // Initializes all multiples of 2 with 2
        for (int i = 4; i < MAX; i += 2)
            factor[i] = 2;


        for (int i = 3; i * i < MAX; i++) {

            // check if it has no prime factor.
            if (factor[i] == i) {

                // Initializes of j starting from i*i
                for (int j = i * i; j < MAX; j += i) {


                    if (factor[j] == j)
                        factor[j] = i;
                }
            }
        }
    }

    public static int calculateNoOFactors(int n)
    {
        if (n == 1)
            return 1;

        int ans = 1;

        // stores the smallest prime number
        // that divides n
        int dup = factor[n];

        // stores the count of number of times
        // a prime number divides n.
        int c = 1;


        int j = n / factor[n];

        // false when prime factorization is done
        while (j != 1) {

            if (factor[j] == dup)
                c += 1;

            else {
                dup = factor[j];
                ans = ans * (c + 1);
                c = 1;
            }

            j = j / factor[j];
        }

        ans = ans * (c + 1);

        return ans;
    }

    public static int smallest(int n)
    {
        for (int i = 1;; i++)

            if (calculateNoOFactors(i) >= n)
                return i;
    }
    public static void main(String[] args) {
        generatePrimeFactors();

        int n = 16;
        System.out.println(smallest(n));

    }
}
