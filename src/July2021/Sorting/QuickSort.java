package July2021.Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Size of array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter Elements of array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            quickSortSolution(arr, n);

        }
    }

    private static void quickSortSolution(int[] arr, int n) {

    }
}
