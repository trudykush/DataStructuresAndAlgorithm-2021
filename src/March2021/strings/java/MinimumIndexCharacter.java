package March2021.strings.java;

import java.util.Arrays;
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
            if (result != 0) {
                System.out.println(result);
            }
        }
    }

    private static char findingMinIndexChar(String inputStr, String patternStr) {
        int[] inputStrChar = new int[inputStr.length()];
        int[] patStrChar = new int[patternStr.length()];

        Arrays.fill(inputStrChar, -1);
        Arrays.fill(patStrChar, -1);

        for (int i = 0; i < patternStr.length(); i++) {
            if (patStrChar[patternStr.charAt(i)] == inputStr.charAt(i)) {
                inputStrChar[i] = i;
            }
        }

        for (int i = 0; i < inputStrChar.length; i++) {
            if (inputStrChar[i] > -1) {
                return inputStr.charAt(inputStrChar[i]);
            }
        }
        return 0;
    }
}
