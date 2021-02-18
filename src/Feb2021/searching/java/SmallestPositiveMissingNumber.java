package Feb2021.searching.java;

import java.util.Scanner;

public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int result = missingNumber(arr, n);
        }
    }

    private static int missingNumber(int[] arr, int n) {
        int shift = segregate(arr, n);
        return -1;
    }

    private static int segregate(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
        return j;
    }

}
