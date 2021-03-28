package March2021.strings.java;

import java.util.Scanner;

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
        }
    }

    private static String nthPrimeNumberFinder(int input) {
        int rem;
        StringBuilder num = new StringBuilder();
        while (input > 0) {
            rem = input % 4;
            switch (rem) {
                case 1:
                    num.append('2');
                    break;
                case 2:
                    num.append('3');
                    break;
                case 3:
                    num.append('5');
                    break;
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
