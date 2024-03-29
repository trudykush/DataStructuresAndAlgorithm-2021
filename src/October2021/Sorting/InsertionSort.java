package October2021.Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Elements of array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] result = solutionInsertionSort(arr, n);
            printArray(result);
        }
    }

    private static void printArray(int[] result) {
        for (int j : result) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static int[] solutionInsertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
