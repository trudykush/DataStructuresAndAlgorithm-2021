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

            quickSortSolution(arr, 0,n - 1);
            printQuickSortSolution(arr, n);
        }
    }

    private static void printQuickSortSolution(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void quickSortSolution(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSortSolution(arr, low, pi-1);
            quickSortSolution(arr, pi+1, high);
        }
    }

    /*
    * This function takes last element as pivot, places the pivot element
    * at its correct position in sorted array, and places all smaller (smaller than pivot)
    * to left of pivot and all greater elements to right of pivot
    * */
    private static int partition(int[] arr, int low, int high) {

        // pivot
        int pivot = arr[high];

        // Index of smaller element and indicates the right position
        // of pivot found so farS
        int i = low - 1;

        for (int j = 0; j <= high - 1; j++) {
            // If current element if smaller
            // than the pivot
            if (arr[j] < pivot) {
                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }

    private static void swap(int[] arr, int i, int j) {

    }
}
