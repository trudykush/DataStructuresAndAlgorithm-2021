package March2021.strings.java;

import java.util.Scanner;

/*
* A O(log n) solution is discussed
which is based on below pattern in numbers. The
numbers can be seen
                                  ""
      /                |                    |                 \
     2                 3                    5                  7
 / |  | \           / | |  \             /  | | \          /  | |  \
22 23 25 27        32 33 35 37         52 53 55 57        72 73 75 77
/||\/||\/||\/||\   /||\/||\/||\/||\   /||\/||\/||\/||\   /||\/||\/||\/||\

We can notice following :
1st. 5th, 9th. 13th, ..... numbers have 2 as last digit.
2nd. 6th, 10th. 14th, ..... numbers have 3 as last digit.
3nd. 7th, 11th. 15th, ..... numbers have 5 as last digit.
4th. 8th, 12th. 16th, ..... numbers have 7 as last digit.
* */

public class NthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of test cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Please enter the number to " +
                    "find the prime number at that position");
            int input = sc.nextInt();
            String result = nthPrimeNumberFinder(input);
            System.out.println("Prime number at position: " +
                    input + " is: " + result);
        }
    }

    private static String nthPrimeNumberFinder(int input) {
        int rem;
        StringBuilder num = new StringBuilder();
        while (input > 0) {
            // remainder for check element position
            rem = input % 4;
            switch (rem) {
                // if number is 1st position in tree
                case 1:
                    num.append('2');
                    break;
                // if number is 2nd position in tree
                case 2:
                    num.append('3');
                    break;
                // if number is 3rd position in tree
                case 3:
                    num.append('5');
                    break;
                // if number is 4st position in tree
                case 0:
                    num.append('7');
                    break;
            }
            if (input % 4 == 0) {
                input--;
            }
            input = input / 4;
        }
        return new StringBuilder(num).reverse().toString();
    }
}
