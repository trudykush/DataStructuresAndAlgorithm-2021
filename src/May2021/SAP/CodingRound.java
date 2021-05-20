package May2021.SAP;


/*
* Reverse array,  palindrome
* */
public class CodingRound {
    public static void main(String[] args) {
        String input = "hello";

        char[] inputArray = input.toCharArray();
        for (int i = inputArray.length - 1; i >= 0; i--) {
            System.out.println(inputArray[i]);
        }
    }


    class Node {
        int key ;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.println(node.key + " ");
        printInorder(node.right);
    }
}



