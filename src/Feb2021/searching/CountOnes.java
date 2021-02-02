package Feb2021.searching;

import java.util.Scanner;

public class CountOnes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            int lengthOfCases = sc.nextInt();
            int[] arr = new int[lengthOfCases];

            for (int i = 0; i < lengthOfCases; i++) {
                arr[i] = sc.nextInt();
            }
            int result = countingOnesMethod(arr, lengthOfCases);
            System.out.println(result);
        }
    }

    private static int countingOnesMethod(int[] arr, int n) {
        int result = 0;

        int low = 0, high = n-1;

        int mid = low + (high - low) / 2;
        // or int mid = (low + high) >>> 1;

        // if mid is 1, check for upper half
        if (arr[mid] == 1 && mid+1 < n && arr[mid+1] == 1) {
            low = mid+1;
        }

        // if mid is 0, then iterate for upper half
        else if (arr[mid] == 0) {
            high = mid - 1;
        }

        // else iterate for lower half
        else if (arr[mid] == 1 && ((mid+1 < n && arr[mid+1] == 0)
                || (mid == n-1))) {
            return mid+1;
        }

        return result;
    }
}
