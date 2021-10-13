package October2021.Arrays;

import java.util.Scanner;

public class StrongestNeighbour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            int sizeOfArray = sc.nextInt();
            int[] arr = new int[sizeOfArray];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        }
    }
}
