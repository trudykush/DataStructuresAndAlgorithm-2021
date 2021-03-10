package March2021.strings.java;

import java.util.Arrays;
import java.util.Scanner;

public class NonRepeatingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            String inputStr = sc.next();

            firstNonRepeatingChar(inputStr);
        }
    }

    private static int firstNonRepeatingChar(String inputStr) {
        int[] map = new int[256];
        Arrays.fill(map, 0);
        for (int i = 0; i < inputStr.length(); i++) {
            if (map[inputStr.charAt(i)] > 1) {
                return i;
            } else {
                map[inputStr.charAt(i)] = map[inputStr.charAt(i)]++;
            }
        }
        return -1;
    }
}
