package July2021.Sorting;

import java.awt.*;
import java.util.Scanner;

public class CountInversionInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int result = enhancedMergeSort(arr, 0, n-1);
        }
    }

    /*
    * To count the inversion in array - we will use the enhanced Merge sort
    * Complexity Analysis:
    * Time Complexity: O(n log n), The algorithm used is divide and conquer,
    * So in each level, one full array traversal is needed,
    * and there are log n levels, so the time complexity is O(n log n).
    * Space Complexity: O(n), Temporary array.
    * */
    private static int enhancedMergeSort(int[] arr, int l, int r) {

        // keep track of the inversion count at a
        // particular node of the recursion tree
        int count = 0;

        if (l < r) {
            int m = l + (r - l)/2;

            // Total inversion count =
            // left subArray count + right subArray count +  merge count

            // Left subArray count
            count += enhancedMergeSort(arr, l, m);

            // Right subArray count
            count += enhancedMergeSort(arr, m+1, r);

            // Merge count
            count += mergeAndCount(arr, l, m, r);
        }

        return l;
    }

    private static int mergeAndCount(int[] arr, int l, int m, int r) {
        return 0;
    }
}
