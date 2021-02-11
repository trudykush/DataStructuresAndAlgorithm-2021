package Feb2021.sorting.java;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            performQuickSort(arr, 0, n-1);
        }
    }

    private static void performQuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            performQuickSort(arr, low, pivot-1);
            performQuickSort(arr, pivot+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        return low;
    }
}
