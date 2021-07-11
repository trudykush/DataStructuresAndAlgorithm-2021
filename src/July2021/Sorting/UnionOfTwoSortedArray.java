package July2021.Sorting;

import java.util.Scanner;

// Include distinct elements in the final sorted array
public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Enter the length of first array: ");
            int n = sc.nextInt();
            System.out.println("Enter the elements of the first array: ");
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
        }
    }
}
