package June2021.Queue;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of cases: ");
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            System.out.println("Enter the size of queue: ");
            int q = sc.nextInt();
            QueueByStack queueByStack = new QueueByStack();
            while (q-- > 0) {
                System.out.println("Enter 1 for Enqueue or 2 for Dequeue");
                int queueType = sc.nextInt();
                if (queueType == 1) {
                    int a = sc.nextInt();
                    queueByStack.enqueue(a);
                } else {
                    int result = queueByStack.dequeue();
                    System.out.println(result);
                }
            }
        }
    }

    private static class QueueByStack {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public void enqueue(int a) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(a);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int dequeue() {
            return 0;
        }
    }
}
