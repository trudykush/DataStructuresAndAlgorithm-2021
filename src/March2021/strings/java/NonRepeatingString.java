package March2021.strings.java;

import java.util.Arrays;
import java.util.Scanner;

public class NonRepeatingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            String inputStr = sc.next();

            int result = firstNonRepeatingChar(inputStr);
            if (result >= 0) {
                System.out.println("Non-repeating string is: " + inputStr.charAt(result));
            } else {
                System.out.println("No non-repeating string");
            }
        }
    }

    private static int firstNonRepeatingChar(String inputStr) {
        int[] map = new int[256];
        Arrays.fill(map, 0);
        int x = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            map[inputStr.charAt(i)] = map[inputStr.charAt(i)] + 1;
        }

        for (int i = 0; i < inputStr.length(); i++) {
            if (map[inputStr.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}
