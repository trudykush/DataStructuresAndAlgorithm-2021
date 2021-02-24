package Feb2021.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Enter first word: ");
            String fw = sc.next();
            System.out.println("Enter second word: ");
            String sw = sc.next();

            String result = isAnagram(fw, sw);
            System.out.println(result);
        }
    }

    private static String isAnagram(String fw, String sw) {
        boolean result = true;
        char[] fwChar = fw.toCharArray();
        char[] swChar = sw.toCharArray();

        if (fwChar.length != swChar.length) {
            result = false;
        }

        Arrays.sort(fwChar);
        Arrays.sort(swChar);

        for (int i = 0; i < fwChar.length; i++) {
            if (fwChar[i] != swChar[i]) {
                result = false;
            }
        }
        return result ? "The input strings are Anagram" :
                "The input strings are not Anagram";
    }
}
