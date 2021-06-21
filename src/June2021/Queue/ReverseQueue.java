package June2021.Queue;

import java.util.Queue;
import java.util.Scanner;

public class ReverseQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number Of Cases: ");
        int numberOfCases = sc.nextInt();

        while (numberOfCases -- > 0) {
            System.out.println("Size of Queue");
            int q = sc.nextInt();

            MyQueueByLL queue = new MyQueueByLL();
            while (q-- > 0) {
                int queueElement = sc.nextInt();
                queue.enQueue(queueElement);
            }
        }
    }

    private static class MyQueueByLL {
        QNode front, rear;

        public MyQueueByLL() {
            this.front = this.rear = null;
        }
        public void enQueue(int queueElement) {
            QNode temp = new QNode(queueElement);
            if (this.rear == null) {
                this.front = this.rear = temp;
                return;
            }

            this.rear.next = temp;
            this.rear = temp;
        }

        public boolean isEmpty() {
            return this.front != null || this.rear != null;
        }


    }

    private static class QNode {
        int key;
        QNode next;

        public QNode(int key) {
            this.key = key;
            this.next = null;
        }
    }

    static Queue<Integer> reverseQueue(Queue<Integer> q)
    {
        // Base case
        if (q.isEmpty())
            return q;

        // Dequeue current item (from front)
        int data = q.peek();
        q.remove();

        // Reverse remaining queue
        q = reverseQueue(q);

        // Enqueue current item (to rear)
        q.add(data);

        return q;
    }

}
