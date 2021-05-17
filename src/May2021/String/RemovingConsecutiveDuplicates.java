package May2021.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RemovingConsecutiveDuplicates {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String str = br.readLine().trim();
            System.out.println(removeConseDuplicates(str.toCharArray()));
        }
    }

    private static String removeConseDuplicates(char[] str) {

        int n = str.length;
        // if string is empty or single character
        if (n < 2) {
            return String.valueOf(str[0]);
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (str[j] != str[i]) {
                j++;
                str[j] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOfRange(str, 0, j+1));
    }
}
