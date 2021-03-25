package March2021.strings.java;

import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of test-cases to be performed:");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Please enter the input String:");
            String str = sc.next();

            boolean result = checkingIfPangram(str);
            // Printing result in here
            if (result) {
                System.out.println("The given string is pangram");
            } else {
                System.out.println("The given string is not pangram");
            }
        }
    }

}
