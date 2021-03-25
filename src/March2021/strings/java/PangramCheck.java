package March2021.strings.java;

import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            String str = sc.next();

            boolean result = checkingIfPangram(str);
            System.out.println(result);
        }
    }

    private static boolean checkingIfPangram(String str) {
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            } else {
                continue;
            }
            mark[index] = true;
        }

        for (int i = 0; i < 25; i++) {
            if (!mark[i]) {
                return false;
            }
        }
        return true;
    }
}
