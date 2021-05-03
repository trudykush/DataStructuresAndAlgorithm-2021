package May2021.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImplementStackUsingArray {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t > 0) {
            MyStack obj = new MyStack();
            int Q = Integer.parseInt(read.readLine());
            int k = 0;
            String[] str = read.readLine().trim().split(" ");
            while (Q > 0) {
                int QueryType = 0;
                QueryType = Integer.parseInt(str[k++]);
                if (QueryType == 1) {
                    int a = Integer.parseInt(str[k++]);
                    obj.push(a);
                } else if (QueryType == 2) {
                    System.out.println(obj.pop() + " ");
                }
                Q--;
            }
            System.out.println("");
            t--;
        }
    }

    private static class MyStack {
        int top;
        int MAX = 1000;
        int arr[] = new int[MAX];
        MyStack() {
            top = -1;
        }
        public boolean push(int a) {
            if (top >= (MAX - 1)) {
                System.out.println("Stack Overflow");
                return false;
            } else {
                arr[++top] = a;
                System.out.println(a + " pushed into stack");
                return true;
            }
        }

        public int pop() {
            if(top < 0) {
                System.out.println("Stack Underflow");
                return 0;
            } else  {
                int x = arr[top--];
                return x;
            }
        }

        public int peek() {
            if (top < 0) {
                System.out.println("Stack underflow");
                return 0;
            } else {
                int x = arr[top];
                return x;
            }
        }
    }
}
