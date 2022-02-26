package Feb2022.arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Array Elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Rotate array at element: ");
            int rotateElementPosition = sc.nextInt();

            System.out.println("Original Array: ");
            printArray(arr, n);

            rotateArray(arr, n, rotateElementPosition);

            System.out.println("Array after rotation: ");
            printArray(arr, n);

        }
    }

    private static void rotateArray(int[] arr, int n, int rotateElementPosition) {
        reverse(arr, 0, rotateElementPosition-1);
        reverse(arr, rotateElementPosition, n-1);
        reverse(arr, 0, n-1);
    }

    private static void reverse(int[] arr, int low, int high) {
        while (low <  high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    private static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}