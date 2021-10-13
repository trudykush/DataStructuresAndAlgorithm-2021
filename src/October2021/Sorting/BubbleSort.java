package October2021.Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
               arr[i] = sc.nextInt();
            }
            
            solutionBubbleSort(arr, n);
        }
    }

    private static void solutionBubbleSort(int[] arr, int n) {

        int i, j, temp;
        boolean swapped;

        for (i = 0; i < n - 1; i++) {

        }
    }
}
