package May2021.Stack;

import java.util.Scanner;
import java.util.Stack;

public class OperationsOnStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            Stack<Integer> st = new Stack<>();

            int q = sc.nextInt();

            while (q-- > 0) {
                char ch = sc.next().charAt(0);
                HelperStack obj = new HelperStack();
                if (ch == 'i') {
                    int x = sc.nextInt();
                    obj.insert(st, x);
                }
            }
        }
    }

    private static class HelperStack {
        public void insert(Stack<Integer> st, int x) {

        }
    }
}
