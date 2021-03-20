package March2021.strings.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximumOccuringChar {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String inputStr = br.readLine();
            char result = maxOccuranceChar(inputStr);
        }
    }

    private static char maxOccuranceChar(String inputStr) {
        int[] map = new int[256];
        Arrays.fill(map, -1);
        for (int i = 0; i < inputStr.length(); i++) {
            if (map[inputStr.charAt(i)] == -1) {
                map[inputStr.charAt(i)] = map[inputStr.charAt(i)] + 1;
            }
        }
        return 0;
    }
}
