package Trees.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
    private static class Node {
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;
    public String serialize() {
        return serialize(root);
    }
    private String serialize(Node root) {
        if(root == null) return null;
        StringBuilder sb = new StringBuilder();

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {

            Node node = queue.poll();
            sb.append(node.val).append(",");

            if(node.left != null) {
                queue.offer(node.left);
            } else {
                sb.append(" ,");
            }

            if(node.right != null) {
                queue.offer(node.right);
            } else {
                sb.append(" ,");
            }

        }

        return sb.toString();

    }
    public void Deserialize(String s) {

    }

    public void insert(int val) {
        root = insert(val, root);
    }

    private Node insert(int val, Node node) {
        if (node == null) {
            node = new Node(val);
            return node;
        }

        if (val <= node.val) {
            node.left = insert(val, node.left);
        }

        if (val > node.val) {
            node.right = insert(val, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;

    }

    public void display() {
        display(root, 0);
    }

    private void display(Node node, int indent) {
        if (node == null) {
            return;
        }
        display(node.right, indent + 1);

        if (indent != 0) {
            for (int i = 1; i < indent; i++) {
                System.out.print("|\t");
            }
            System.out.println("|--->" + node.val);
        } else {
            System.out.println(node.val);
        }

        display(node.left, indent + 1);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public void BFS() {
        if (root == null) {
            System.out.println("Nothing Here");
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }

            System.out.print(node.val + "->");
        }
    }

    public int levelOrderSuccessor(int target) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            if(node.val == target) {
                break;
            }
        }
        if(!queue.isEmpty()) {
            return queue.poll().val;
        }
        return -1;
    }

}
