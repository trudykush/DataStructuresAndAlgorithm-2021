package Feb2021.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySubString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                            new InputStreamReader(System.in));
        int numberOfCases = br.read();
        while (numberOfCases-- > 0) {
            String inputStr = br.readLine();

            int result = findingAllSubStringEndingWithOne(inputStr);
            System.out.println(result);
        }
    }

    private static int findingAllSubStringEndingWithOne(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 1) {
                count++;
            }
        }
        return (count*(count-1))/2;
    }
}
