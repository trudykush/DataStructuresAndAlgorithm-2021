package Feb2022.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int numberOfCases = Integer.parseInt(br.readLine().trim());
            while (numberOfCases-- > 0) {
                /*int n = Integer.parseInt(br.readLine().trim());
                String[] str = br.readLine().split(" ");

                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(str[i]);
                }

                int[] ans = findTwoElements(arr, n);
                System.out.println(ans[0] + " " + ans[1]);*/

                hashMapSolution();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void hashMapSolution() {
        int[] arr = { 4, 3, 6, 2, 1, 1 };

        Map<Integer, Boolean> numberMap = new HashMap<>();

        int n = arr.length;
        for (Integer i : arr) {
            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            } else {
                System.out.println("Repeating Number: " + i);
            }
        }

        for (int i = 1; i <= n; i++) {
            if (numberMap.get(i) == null) {
                System.out.println("Missing Number: " + i);
            }
        }

    }

    private static int[] findTwoElements(int[] arr, int n) {
        int repeat = 0;
        int missing = 1;
        int count = 2;
        Arrays.sort(arr);
        int[] result = new int[n];

        for (int i = 1; i < n; i++) {
            if (arr[i] != count) {
                System.out.println(arr[i] != count);
                System.out.println(arr[i] + " " + count);
                missing = count;
                count++;
            } else if (arr[i] == arr[i - 1]) {
                repeat = arr[i];
                i++;
            }
        }
        result[0] = repeat;
        result[1] = missing;

        return result;
    }
}
