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

        // a loop to slide pat one by one
        for (int i = 0; i < m - n; i++) {
            int j;
            // for current index i, check for pattern match
            for (j = 0; j < n; j++) {
                if (txtString.charAt(i+j) != patString.charAt(j)) {
                    break;
                }
            }
            if (j == n) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }
}
