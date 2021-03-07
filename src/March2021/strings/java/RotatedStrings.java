package March2021.strings.java;

import java.util.Scanner;

public class RotatedStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cases: ");
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            System.out.println("Enter first String: ");
            String firstStr = sc.next();
            System.out.println("Enter second String: ");
            String secondStr = sc.next();

            boolean result = isRotated(firstStr, secondStr);
            if (result) {
                System.out.println("String is rotated");
            } else {
                System.out.println("String is not rotated");
            }
        }
    }

    private static boolean isRotated(String firstStr, String secondStr) {
        // Checking length is same of both strings
        /* Also checking second string must be a substring of
        *  first String concatenated second String
        */
        return (firstStr.length() == secondStr.length()) &&
                ((firstStr + secondStr).contains(secondStr));
    }
}
