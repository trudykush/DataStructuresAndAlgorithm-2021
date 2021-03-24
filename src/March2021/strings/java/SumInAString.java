package March2021.strings.java;

import java.util.Scanner;

public class SumInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        findSum(str);
    }

    private static int findSum(String str) {
        // A temporary String
        StringBuilder temp = new StringBuilder("0");

        // holds sum of all numbers present in the string
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if current char is a digit
            if (Character.isDigit(ch)) {
                temp.append(ch);
            } else {    // if current char is an alphabet
                sum += Integer.parseInt(String.valueOf(temp));

                // reset temp string to empty
                temp.setLength(0);
            }
        }
        return sum + Integer.parseInt(String.valueOf(temp));
    }
}
