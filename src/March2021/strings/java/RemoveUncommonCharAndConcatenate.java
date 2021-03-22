package March2021.strings.java;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveUncommonCharAndConcatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            removingUncommonChar(str1, str2);
        }
    }

    private static void removingUncommonChar(String str1,
                                                String str2) {
        int[] map = new int[256];
        Arrays.fill(map, -1);
        for (int i = 0; i < str1.length(); i++) {
            if (map[str1.charAt(i)] == -1) {
                map[str1.charAt(i)] = str1.charAt(i);
            }
        }


    }
}
