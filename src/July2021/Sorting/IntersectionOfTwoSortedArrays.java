package July2021.Sorting;

import java.util.Scanner;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int n = sc.nextInt();
        while (n-- > 0) {
            System.out.println("Enter the size of first array: ");
            int m1 = sc.nextInt();
            System.out.println("Enter the elements of first array: ");
            int[] arr1 = new int[m1];
            for (int i = 0; i < m1; i++) {
                arr1[i] = sc.nextInt();
            }

            System.out.println("Enter the size of second array: ");
            int m2 = sc.nextInt();
            System.out.println("Enter the elements of second array: ");
            int[] arr2 = new int[m2];
            for (int i = 0; i < m2; i++) {
                arr2[i] = sc.nextInt();
            }

            intersectionSolution(arr1, m1, arr2, m2);
        }
    }

    private static void intersectionSolution(int[] arr1, int m1, int[] arr2, int m2) {

        int i = 0, j = 0;
        while (i < m1 && j < m2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                System.out.println(arr2[j++] + " ");
                i++;
            }
        }
    }
}
