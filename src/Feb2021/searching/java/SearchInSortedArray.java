package Feb2021.searching.java;

import java.util.Scanner;

public class SearchInSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int elementToSearch = sc.nextInt();
            int result = searchingSortedArray(arr, n, elementToSearch);
            System.out.println("Element present at " + result);
        }
    }

    private static int searchingSortedArray(int[] arr, int n, int x) {
        int low = 0;
        int high = n-1;

        while (low <= high) {
            int mid = (low + high) >>> 1;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] < x) {
                high = mid - 1;
            } else if (arr[mid] > x) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
