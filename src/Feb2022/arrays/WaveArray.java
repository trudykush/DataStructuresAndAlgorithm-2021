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

    }
}
