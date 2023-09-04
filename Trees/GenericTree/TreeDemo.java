package Trees.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

class GenericTree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void populate(int[] arr) {
        Stack<Node> st = new Stack<>();
        for (int element : arr) {
            if (element != -1) {
                Node temp = new Node(element);
                if (!st.isEmpty()) {
                    st.peek().children.add(temp);
                } else {
                    root = temp;
                }
                st.push(temp);
            } else {
                st.pop();
            }
        }
    }

    public void display() {
        display(root);
    }

    private void display(Node node) {
        System.out.print(node.data + "--> [");
        for (Node child : node.children) {
            System.out.print(child.data + ",");
        }
        System.out.print("]" + "\n");

        for (Node child : node.children) {
            display(child);
        }
    }



}


public class TreeDemo {
    public static void main(String[] args) {
        GenericTree tree = new GenericTree();
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1,
                80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        tree.populate(arr);
        tree.display();


    }


}
