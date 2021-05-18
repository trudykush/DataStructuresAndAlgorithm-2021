package May2021.Arrays;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();

        if (areBracketsBalanced(inputStr)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }

    private static boolean areBracketsBalanced(String inputStr) {
        return false;
    }
}
