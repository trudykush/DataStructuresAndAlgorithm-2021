package April2021.arrays;

import java.util.HashMap;

public class MaxLenSubArrayOfValueK {

    public static void main(String [] args) {
        // you can write to stdout for debugging purposes, e.g.
        System.out.println("This is a debug message");
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        int[] arr2 = {2, -7, 8, 4, 6, 1};
        int k2 = 5;

        int result = findingSubArray2(arr2, k2);
        System.out.println(result);
    }

    public int findingSubArray(int[] arr, int k) {

        int result = 0;
        int counter;
        for(int i=0; i<arr.length - 1; i++) {
            int pos1 = arr[i];
            counter = i+1;
            while ((counter < arr.length - 1) && ((pos1 + arr[counter+1]) == k)) {
                result =+ 1;
                counter++;
            }
        }
        return result;
    }

    public static int findingSubArray2(int[] arr, int k) {

        int n = arr.length;
        int res = 0;
        int maxLen = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += arr[j];

                //check
                if (sum == k) {
                    res = (j - i) + 1;
                }
                if (res > maxLen) {
                    maxLen = res;
                }
            }
        }

        return maxLen;
    }
}
