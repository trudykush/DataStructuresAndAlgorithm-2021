package August2021.sort;

import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of test cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sort(arr, n);
        }
    }

    // Hint: https://www.geeksforgeeks.org/heap-sort/
    private static void sort(int[] arr, int n) {

    }
}
