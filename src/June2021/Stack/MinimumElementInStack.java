package June2021.Stack;

public class MinimumElementInStack {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }

    private static class MyStack {
        public void push(int x) {

        }

        public void getMin() {

        }

        public void pop() {

        }

        public void peek() {

        }
    }
}
