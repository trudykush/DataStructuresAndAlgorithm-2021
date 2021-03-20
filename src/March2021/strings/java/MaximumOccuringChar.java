package March2021.strings.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumOccuringChar {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String inputStr = br.readLine();
            char result = maxOccuranceChar(inputStr);
            System.out.println(result);
        }
    }

    private static char maxOccuranceChar(String inputStr) {
        int[] map = new int[256];
        Arrays.fill(map, -1);
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < inputStr.length(); i++) {
            if (map[inputStr.charAt(i)] == -1) {
                map[inputStr.charAt(i)] =
                        map[inputStr.charAt(i)] + 1;
            } else if (map[inputStr.charAt(i)] >= 0) {
                map[inputStr.charAt(i)] =
                        map[inputStr.charAt(i)] + 1;
                tempList.add((int)inputStr.charAt(i));
            }
        }

        if(tempList.size() == 1) {
            int x = tempList.get(0);
            return ((char)x);
        } else if (tempList.size() < 1) {
            return '-';
        }

        int smallestChar = Integer.MAX_VALUE;
        for (int i = 0; i < tempList.size(); i++) {
            if (tempList.get(i) < smallestChar) {
                smallestChar = tempList.get(i);
            }
        }
        return (char)smallestChar;
    }

    public char getMaxOccuranceChar(String str) {
        // create array to keep the count of individual
        // character and initialize the array as 0
        int count[] = new int[256];

        // construct char count array from the input str
        int len = str.length();
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
        }

        int max = -1;       // Initialize max count
        char result = ' ';  // Initialize result

        //Traversing through the string and maintaining
        // the count of each char
        for (int i = 0; i < len; i++) {
            if(max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }
}
