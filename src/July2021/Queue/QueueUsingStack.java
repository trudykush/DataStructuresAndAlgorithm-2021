package July2021.Queue;

import java.util.Scanner;

public class QueueUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cases: ");
        int numOfCases = sc.nextInt();
        while (numOfCases-- > 0) {
            System.out.println("Enter the size of Queue: ");
            int n = sc.nextInt();
            QueueStack qStack = new QueueStack(n);
            System.out.println("Enter choice of action: ");
            int qChoice = sc.nextInt();
            if (qChoice == 1) {
                System.out.println("Enter the element: ");
                int element = sc.nextInt();
                qStack.enqueue(element);
            } else {
                qStack.deQueue();
            }
        }
    }

    private static class QueueStack {
         int capacity;
        public QueueStack(int c) {
            this.capacity = c;
        }

        public void enqueue(int element) {

        }

        public void deQueue() {
        }
    }
}
