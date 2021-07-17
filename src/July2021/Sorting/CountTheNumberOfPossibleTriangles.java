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

            countingTriangles(arr, n);
        }
    }

    private static void countingTriangles(int[] arr, int n) {
        Arrays.sort(arr);
    }
}
