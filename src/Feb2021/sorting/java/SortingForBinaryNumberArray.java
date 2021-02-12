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

    }
}
