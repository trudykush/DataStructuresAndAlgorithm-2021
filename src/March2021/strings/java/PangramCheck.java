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
            // Printing result
            if (result) {
                System.out.println("The given string is pangram");
            } else {
                System.out.println("The given string is not pangram");
            }
        }
    }

    private static boolean checkingIfPangram(String str) {
        // create a hash table to mark the characters present in the string
        // by default all the elements of mark would be false
        boolean[] mark = new boolean[26];
        // For indexing in mark[]
        int index = 0;
        // Traverse all characters
        for (int i = 0; i < str.length(); i++) {
            // If uppercase char, subtract 'A' to find index
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            }
            // If lowercase char, subtract 'a' to find index
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            }
            // If this char is other than english
            // lowercase and uppercase char
            else {
                continue;
            }
            mark[index] = true;
        }

        // return false if any char is unmarked
        for (int i = 0; i < 25; i++) {
            if (!mark[i]) {
                return false;
            }
        }
        // if all char are present
        return true;
    }
}
