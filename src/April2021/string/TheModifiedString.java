package April2021.string;

import java.util.Scanner;

public class TheModifiedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            String inputString = sc.next();
            System.out.println(new Solution().modified(inputString));
        }
    }

    private static class Solution {
        public long modified(String inputString) {

            return 0;
        }
    }
}
