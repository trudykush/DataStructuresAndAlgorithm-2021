package July2021.Sorting;

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

            enhancedMergeSort(arr, n);
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
    private static void enhancedMergeSort(int[] arr, int n) {

    }
}
