package Feb2021.strings.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySubString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                            new InputStreamReader(System.in));
        System.out.println("Please enter the number of cases: ");
        int numberOfCases = Integer.parseInt(br.readLine());
        while (numberOfCases-- > 0) {
            System.out.println("Please enter the input string: ");
            String inputStr = br.readLine();

            int result = findingAllSubStringEndingWithOne(inputStr);
            System.out.println("Number of substring for given input is: " + result);
        }
    }

    private static int findingAllSubStringEndingWithOne(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1') {
                count++;
            }
        }
        return (count*(count-1))/2;
    }
}
