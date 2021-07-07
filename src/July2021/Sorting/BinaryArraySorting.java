package July2021.Sorting;

import java.util.Scanner;

public class BinaryArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Size of Binary Array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements of array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            sortingBinaryNumbers(arr, n);
        }
    }

    private static void sortingBinaryNumbers(int[] arr, int n) {
        int i = 0;
        int j = n-1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                swap(arr, arr[i], arr[j]);
                i++;
                j--;
            } else if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
