package June2021.Recursion;

import java.util.Scanner;

public class PowerUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            int value = sc.nextInt();
            int power = sc.nextInt();

            recursivePower(value, power);
        }
    }

    private static void recursivePower(int value, int power) {

    }
}
