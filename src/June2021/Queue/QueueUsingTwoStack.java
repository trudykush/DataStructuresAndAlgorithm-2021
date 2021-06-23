package June2021.Queue;

import java.util.Scanner;

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

                } else {

                }
            }
        }
    }

    private static class QueueByStack {
    }
}
