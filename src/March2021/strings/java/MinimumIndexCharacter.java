package March2021.strings.java;

import java.util.Scanner;

public class MinimumIndexCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Please enter the input string");
            String inputStr = sc.next();
            System.out.println("Please enter the pattern string");
            String patternStr = sc.next();

            char result = findingMinIndexChar(inputStr, patternStr);
        }
    }

    private static char findingMinIndexChar(String inputStr, String patternStr) {

        return 0;
    }
}
