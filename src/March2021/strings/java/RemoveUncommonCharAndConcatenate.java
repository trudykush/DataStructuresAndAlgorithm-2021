package March2021.strings.java;

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

    }
}
