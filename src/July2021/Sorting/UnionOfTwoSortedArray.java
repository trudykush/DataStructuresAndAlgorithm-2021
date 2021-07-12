package July2021.Sorting;

import java.util.Scanner;

// Include distinct elements in the final sorted array
public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            // First array
            System.out.println("Enter the length of first array: ");
            int n = sc.nextInt();
            System.out.println("Enter the elements of the first array: ");
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }

            // Second array
            System.out.println("Enter the length of second array: ");
            int m = sc.nextInt();
            System.out.println("Enter the elements of the second array: ");
            int[] arr2 = new int[m];
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }

            int[] result = unionOfArraySolution(arr1, n, arr2, m);
            printSolution(result);
        }
    }

    private static void printSolution(int[] result) {
        for (int j : result) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static int[] unionOfArraySolution(int[] arr1, int n, int[] arr2, int m) {
        int[] solutionArray = new int[n];
        int i = 0, j = 0, k = 0;

        // check if arr1 is repetitive
        while ((i < n) && (arr1[i] == arr1[i+1])) {
            i++;
        }
        // check if arr2 is repetitive
        while ((j < m) && (arr2[j] == arr2[j+1])) {
            j++;
        }

        while ((i < n) && (j < m)) {
            if (arr1[i] < arr2[j]) {
                solutionArray[k++] = arr1[i++];
            } else {
                solutionArray[k++] = arr2[j++];
            }
        }

        while (i < n) {
            solutionArray[k++] = arr1[i++];
        }

        while (j < m) {
            solutionArray[k++] = arr2[j++];
        }

        return solutionArray;
    }

    private static void unionOfArray(int arr1[], int arr2[]) {

        int m = arr1[arr1.length - 1];
        int n = arr2[arr2.length - 1];

        int ans = 0;

        if (m > n) {
            ans = m;
        } else {
            ans = n;
        }

        int[] newTable = new int[ans + 1];

        System.out.println(arr1[0] + " ");

        ++newTable[arr1[0]];
    }
}
