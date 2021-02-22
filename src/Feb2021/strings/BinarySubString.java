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
            int inputStr = br.read();

            findingAllSubStringEndingWithOne(inputStr);
        }
    }

    private static void findingAllSubStringEndingWithOne(int str) {

    }
}
