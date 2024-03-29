package October2021.Arrays;

import java.util.Scanner;

public class StrongestNeighbour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Enter the size of the array: ");
            int sizeOfArray = sc.nextInt();
            int[] arr = new int[sizeOfArray];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int[] result = maxAdjacentPart2(arr, sizeOfArray);
            printResult(result);
        }
    }

    private static void printResult(int[] result) {
        for (int i : result) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    // Extra space
    private static int[] maximumAdjacent(int[] arr, int n) {
        int[] result = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            if (arr[i] >= arr[i+1]) {
                result[i] = arr[i];
            } else if (arr[i] < arr[i+1]) {
                result[i] = arr[i+1];
            }
        }
        return result;
    }

    // In-Line solution
    private static int[] maxAdjacentPart2(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            if (arr[i] >= arr[i+1]) {
                arr[i] = arr[i];
            } else if (arr[i] < arr[i+1]) {
                arr[i] = arr[i+1];
            }
        }
        return arr;
    }
}
