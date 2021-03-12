package March2021.strings.java;

import java.util.Arrays;
import java.util.Scanner;

/*
* Two strings are isomorphic if the characters in s can be replaced to get t.
* All occurrences of a character must be replaced with another character while
* preserving the order of characters. No two characters may map to the same
* character but a character may map to itself. For example, Given "egg", "add",
* return true.
* */

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            String firstStr  = sc.next();
            String secondStr = sc.next();

            boolean result = isIsomorphic(firstStr, secondStr);
            System.out.println(result);
        }
    }

    private static boolean isIsomorphic(String firstStr, String secondStr) {
        int n1 = firstStr.length();
        int n2 = secondStr.length();
        if (n1 != n2) {
            return false;
        } else {
            int[] map = new int[256];
            int[] traverse = new int[256];
            int i;
            Arrays.fill(map, -1);
            Arrays.fill(traverse, 0);
            for (i = 0; i < n1; i++) {
                if (map[firstStr.charAt(i)] == -1) {
                    if (traverse[secondStr.charAt(i)] != 0) {
                        return false;
                    }
                    traverse[secondStr.charAt(i)] = 1;
                    map[firstStr.charAt(i)] = secondStr.charAt(i);
                } else {
                    if (map[firstStr.charAt(i)] != secondStr.charAt(i)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
