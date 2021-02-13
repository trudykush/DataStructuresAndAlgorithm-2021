package Feb2021.sorting.java;

import java.util.Scanner;

public class SortingForBinaryNumberArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            sorting(arr, n);
        }
    }

    private static void sorting(int[] arr, int n) {
        int left = 0;
        int right = n-1;

        for (int i = 0; i < n / 2; i++) {
            if (arr[left] == 1 && arr[right] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }

        printResult(arr);
    }

    private static void printResult(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
