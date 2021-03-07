package March2021.strings;

import java.util.Scanner;

public class IsogramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            String inputStr = sc.next();

            isIsogram(inputStr);
        }
    }

    private static void isIsogram(String inputStr) {

    }
}
