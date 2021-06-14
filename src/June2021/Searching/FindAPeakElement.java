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

            System.out.println("Finding a peak element...");

            int result = peakElement(arr, n);
            System.out.println("The Peak Element is: " + result);

            displayArray(arr, n);

        }
    }

    // Performing binary search to find peak element.
    // An array element is a peak if it is NOT smaller than its neighbours.
    private static int peakElement(int[] arr, int n) {
        return  -1;
    }

    private static void displayArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
