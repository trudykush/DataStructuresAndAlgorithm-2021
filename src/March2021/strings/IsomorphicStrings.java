package March2021.strings;

import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            String firstStr  = sc.next();
            String secondStr = sc.next();

            isIsomorphic(firstStr, secondStr);
        }
    }

    private static void isIsomorphic(String firstStr, String secondStr) {

    }
}
