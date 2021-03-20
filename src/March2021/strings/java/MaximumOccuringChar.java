package March2021.strings.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

        return 0;
    }
}
