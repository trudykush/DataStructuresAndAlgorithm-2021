package July2021.Sorting;

import java.util.Arrays;
import java.util.Scanner;

/*
* For a triangle to be possible from 3 values,
* the sum of any of the two values (or sides)
* must be greater than the third value (or third side).
 * */
public class CountTheNumberOfPossibleTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cases: ");
        int m = sc.nextInt();
        while (m-- > 0) {
            int n = sc.nextInt();
            System.out.println("Enter the size of array: ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int result = countingTriangles(arr, n);
            System.out.println("Number of possible triangle " + result);
        }
    }

    private static int countingTriangles(int[] arr, int n) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = n-1; i >= 1; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (arr[l] + arr[r] > arr[i]) {
                    /*
                    * If it is possible, with arr[l], arr[r]
                    * and arr[i] then it is also possible
                    * with arr[l+1]..arr[r-1], arr[r] and arr[i]
                    * */
                    count += r - l;
                    r--;
                } else {
                    /*
                    *
                    * */
                    l++;
                }
            }
        }
        return count;
    }
}
