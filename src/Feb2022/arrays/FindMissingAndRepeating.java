package Feb2022.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int numberOfCases = Integer.parseInt(br.readLine().trim());
            while (numberOfCases-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                String[] str = br.readLine().split(" ");

                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(str[i]);
                }

                int[] ans = findTwoElements(arr, n);
                System.out.println(ans[0] + " " + ans[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] findTwoElements(int[] arr, int n) {

        return new int[0];
    }
}
