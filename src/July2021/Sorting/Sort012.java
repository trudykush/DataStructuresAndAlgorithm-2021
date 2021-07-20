package July2021.Sorting;

import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            sorting012(arr, n);
        }
    }

    private static void sorting012(int[] arr, int n) {
        int lo = 0;
        int high = n-1;
        int mid = 0, temp = 0;
        while (mid < high) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
            }

        }
    }
}
