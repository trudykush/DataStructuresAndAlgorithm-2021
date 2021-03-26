package March2021.strings.java;

import java.util.Arrays;
import java.util.HashMap;
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

    static void printMinIndexChar(String str, String pat) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        int m = str.length();
        int n = pat.length();
        for (int i = 0; i < m; i++) {
            if (!hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), i);
            }
        }

        for (int i = 0; i < n; i++) {
            if(hm.containsKey(pat.charAt(i)) &&
                    hm.get(pat.charAt(i)) < minIndex) {
                minIndex = hm.get(pat.charAt(i));
            }
        }

        if (minIndex != Integer.MAX_VALUE) {
            System.out.println("Minimum Index Char = " +
                        str.charAt(minIndex));
        } else {
            System.out.println("No Character present");
        }
    }

    // Bug in this
    private static char findingMinIndexChar(String inputStr, String patternStr) {
        int[] inputStrChar = new int[inputStr.length()];
        int[] patStrChar = new int[patternStr.length()];

        Arrays.fill(inputStrChar, -1);
        Arrays.fill(patStrChar, -1);

        for (int i = 0; i < patternStr.length(); i++) {
            if (inputStr.length() > i) {
                if (patternStr.charAt(i) == inputStr.charAt(i)) {
                    inputStrChar[i] = i;
                }
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
