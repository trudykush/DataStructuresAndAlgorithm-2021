package March2021.strings.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveUncommonCharAndConcatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            List<Character> result =
                            removingUncommonChar(str1, str2);
            for (char i :
                    result) {
                System.out.println(i);
            }
        }
    }

    private static List<Character> removingUncommonChar(String str1,
                                                        String str2) {
        int[] map = new int[256];
        Arrays.fill(map, -1);
        for (int i = 0; i < str1.length(); i++) {
            if (map[str1.charAt(i)] == -1) {
                map[str1.charAt(i)] = str1.charAt(i);
            }
        }

        List<Character> result = new ArrayList<>();
        for (int i = 0; i < str2.length(); i++) {
            // TODO check which str is bigger - to prevent Out of bound
            if (str2.charAt(i) != map[str1.charAt(i)]) {
                result.add(str2.charAt(i));
            }
        }
        return result;
    }
}
