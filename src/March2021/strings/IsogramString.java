package March2021.strings;

import java.util.Arrays;
import java.util.Scanner;

public class IsogramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            String inputStr = sc.next();

            boolean result = isIsogram(inputStr);
            System.out.println(result);
        }
    }

    private static boolean isIsogram(String inputStr) {
        int[] map = new int[256];
        Arrays.fill(map, -1);
        for (int i = 0; i < inputStr.length(); i++) {
            if (map[inputStr.charAt(i)] != -1) {
                return false;
            } else {
                map[inputStr.charAt(i)] = inputStr.charAt(i);
            }
        }
        return true;
    }
}
