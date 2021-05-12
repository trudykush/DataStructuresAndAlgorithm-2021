package May2021.test;

import java.util.Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 8};

        // Java 8 Way
        int max = Arrays.stream(arr).max().getAsInt();

    }

    public int maxNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        if (arr.length > 0) {
            max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        return max;
    }

}
