package May2021.Arrays;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();

        if (areBracketsBalanced(inputStr)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }

    private static boolean areBracketsBalanced(String inputStr) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < inputStr.length(); i++) {
            char x = inputStr.charAt(i);

            if(x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '}') {
                        return false;
                    }
                    break;
            }
        }
        return (stack.isEmpty());
    }
}
