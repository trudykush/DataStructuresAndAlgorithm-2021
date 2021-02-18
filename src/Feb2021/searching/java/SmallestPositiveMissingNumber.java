package Feb2021.searching.java;

import java.util.Scanner;

public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int result = missingNumber(arr, n);
            System.out.println("Smallest missing number is: " + result);
        }
    }

    //Function to find the smallest positive number missing from the array.
    private static int missingNumber(int[] arr, int n) {
        // First separating positive and negative numbers.
        int shift = segregate(arr, n);
        // Shifting the array
        int[] resultArr = new int[n - shift];
        int j = 0;
        for (int i = shift; i < n; i++) {
            resultArr[j] = arr[i];
            j++;
        }
        //Calling function to find result in the positive part.
        //returning the result.
        return findingMissingNumber(resultArr, j);
    }

    //Finding the smallest positive missing number in an array that contains
    //all positive integers.
    private static int findingMissingNumber(int[] arr, int n) {

        //Marking arr[i] as visited by making arr[arr[i] - 1] negative.
        //Note that 1 is subtracted because index starts from 0 and
        //positive numbers start from 1.
        for (int i = 0; i < n; i++) {
            if (Math.abs(arr[i]) - 1 < n && arr[Math.abs(arr[i]) - 1] > 0) {
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                //Returning the first index where value is positive.
                // 1 is added because index starts from 0.
                return i+1;
            }
        }
        return n+1;
    }

    //Function that puts all non-positive (0 and negative) numbers on left
    //side of arr[] and return count of such numbers.
    private static int segregate(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0) {
                //Changing the position of negative numbers and 0.
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                //Incrementing count of non-positive integers.
                j++;
            }
        }
        return j;
    }

}
