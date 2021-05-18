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

        // using ArrayDeque is faster than using Stack class
        Deque<Character> stack = new ArrayDeque<>();

        // Traversing the expression
        for (int i = 0; i < inputStr.length(); i++) {
            char x = inputStr.charAt(i);

            if(x == '(' || x == '[' || x == '{') {
                // push the element in the stack
                stack.push(x);
                continue;
            }

            /*
            * If current char is not opening bracket, then it must be closing.
            * So stack cannot be empty at this period.
            * */
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
                    if (check == '(' || check == '{') {
                        return false;
                    }
                    break;
            }
        }
        // check the empty stack
        return (stack.isEmpty());
    }
}
