package March2021.strings;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class FirstAppearanceRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            String inputStr = sc.next();
            
            getFirstAppearance(inputStr);
        }
    }

    private static int getFirstAppearance(String inputStr) {
        int result = -1;
        char[] input = inputStr.toCharArray();
        int[] firstIndex = new int[256];
        Arrays.fill(firstIndex, -1);

        result = Integer.MAX_VALUE;
        for (int i = 0; i < inputStr.length(); i++) {
            if (firstIndex[input[i]] == -1) {
                firstIndex[input[i]] = i;
            } else {
                result = Math.min(result, firstIndex[input[i]]);
            }
        }
                
        return (result == Integer.MAX_VALUE) ? -1 : result;
    }

}
