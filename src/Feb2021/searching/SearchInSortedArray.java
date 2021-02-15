package Feb2021.searching;

import java.util.Scanner;

public class SearchInSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int elementToSearch = sc.nextInt();
         //   searchingSortedArray(arr, n, elementToSearch);
        }
    }

}
