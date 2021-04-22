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
            long ans, same;
            ans = 0;
            same = 1;

            for (int i = 1; i < inputString.length(); i++) {
                if (inputString.charAt((int)i) == inputString.charAt((int)i-1)) {
                    same++;
                } else {
                    ans += (same-1)/2;
                    same = 1;
                }
            }
            ans += (same-1)/2;
            return ans;
        }
    }
}
