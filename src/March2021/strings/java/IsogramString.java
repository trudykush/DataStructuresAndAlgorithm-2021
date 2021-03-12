package March2021.strings.java;

import java.util.Arrays;
import java.util.Scanner;

/*
* An Isogram is a word in which no letter occurs more than once.
* Create a method called is_isogram that takes one argument,
* a word to test if it's an isogram.
* If the argument supplied is an empty string, return the argument and False:
* */
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
