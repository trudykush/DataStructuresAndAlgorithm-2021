package Feb2021.strings;

import java.util.Scanner;

public class NativePatternSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            System.out.println("Please enter main string");
            String txtString = sc.next();
            System.out.println("Please enter pattern string");
            String patString = sc.next();

            naiveSearch(txtString, patString);

        }
    }

    private static void naiveSearch(String txtString, String patString) {
        int m = txtString.length();
        int n = patString.length();


    }
}
