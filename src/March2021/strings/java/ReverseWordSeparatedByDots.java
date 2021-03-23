package March2021.strings.java;

import java.util.*;

public class ReverseWordSeparatedByDots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            String str = sc.next();
            String[] separatedString = new String[str.length()];
            separatedString = str.split("\\.");
            Collections.reverse(Arrays.asList(separatedString));
            System.out.println(Arrays.toString(separatedString));

            for (int i = 0; i < separatedString.length; i++) {
                System.out.print(separatedString[i] + ".");
            }
        }
     }
}
