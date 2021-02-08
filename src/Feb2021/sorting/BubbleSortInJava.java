package Feb2021.sorting;

import java.util.Scanner;

public class BubbleSortInJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            bubbleSort(arr, n);
        }
    }

    private static void bubbleSort(int[] arr, int n) {

    }
}
