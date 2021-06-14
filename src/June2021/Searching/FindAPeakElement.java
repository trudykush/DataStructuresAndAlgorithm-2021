package June2021.Searching;

import java.util.Scanner;

public class FindAPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of cases: ");
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements for array of " + n + " size.");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            displayArray(arr, n);
        }
    }

    private static void displayArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
