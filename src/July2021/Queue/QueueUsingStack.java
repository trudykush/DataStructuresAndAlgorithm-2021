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
            QueueStack qStack = new QueueStack();
            System.out.println("Enter choice of action: ");
            int qChoice = sc.nextInt();
            if (qChoice == 1) {
                System.out.println("Enter the element: ");
//                qStack.enqueue();
            }
        }
    }

    private static class QueueStack {
    }
}
