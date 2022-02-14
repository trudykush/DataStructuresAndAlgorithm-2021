package Feb2022.arrays;

import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        while (numCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            waveArraySolution(arr, n);
        }
    }

    private static void waveArraySolution(int[] arr, int n) {
        simpleSolution(arr, n);

        anotherSwapSolution(arr, n);
    }

    private static void anotherSwapSolution(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            // if current even element is smaller than previous - swap
            if (i > 0 && arr[i-1] > arr[i]) {
                swap(arr, i-1, i);
            }

            // if current even element is smaller than next - swap
            if (i < n-1 && arr[i] < arr[i+1]) {
                swap(arr, i, i+1);
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void simpleSolution(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
