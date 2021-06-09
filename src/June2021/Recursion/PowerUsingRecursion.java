package June2021.Recursion;

import java.util.Scanner;

public class PowerUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            int value = sc.nextInt();
            int power = sc.nextInt();

            int result = recursivePower(value, power);
            System.out.println(result);
        }
    }

    private static int recursivePower(int value, int power) {
        while (power > 0) {
            value = (int) Math.pow(value, power);
            power = power - 1;
            recursivePower(value, power);
        }
        return value;
    }
}
