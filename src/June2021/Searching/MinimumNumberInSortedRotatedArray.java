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

            minimumNumber(arr, n);
        }
    }

    private static void minimumNumber(int[] arr, int n) {

    }
}
