package June2021.Searching;

import java.util.Scanner;

public class MinimumNumberInSortedRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int result = minimumNumber(arr, n);
        }
    }

    private static int minimumNumber(int[] arr, int n) {
        return minNumberRecursion(arr, 0, n-1, n);
    }

    private static int minNumberRecursion(int[] arr, int low, int high, int n) {

        int mid = low + (high-low)/2;

        if ((mid > 0 && arr[mid] < arr[mid-1]) ||
                (mid < n-1 && arr[mid] < arr[mid+1])) {
            return mid;
        } else if (arr[mid] < low) {
            minNumberRecursion(arr, low, mid-1, n);
        } else {
            minNumberRecursion(arr, mid+1, high, n);
        }
        return -1;
    }
}
