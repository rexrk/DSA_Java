package Trees;

import java.util.Scanner;

public class BinaryTree {
    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    public void populate(Scanner in) {
        System.out.print("Root Node: ");
        int v = in.nextInt();
        root = new Node(v);

        populate(in, root);
    }

    private void populate(Scanner in, Node node) {

        System.out.print("Insert left of " + node.val + "? (true/false) ");
        boolean left = in.nextBoolean();
        if (left) {
            System.out.print("Enter Left Node : ");
            int l = in.nextInt();

            node.left = new Node(l);
            populate(in, node.left);

        }

        System.out.print("Insert Right of " + node.val + "? (true/false) ");
        boolean right = in.nextBoolean();
        if (right) {
            System.out.print("Enter Right Node: ");
            int r = in.nextInt();

            node.right = new Node(r);
            populate(in, node.right);
        }
    }

    public void display() {
        display(root, "");
    }
    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int indent) {
        if(node == null){
            return;
        }
        prettyDisplay(node.right, indent + 1);

        if(indent != 0){
            for(int i = 1; i < indent; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----->" + node.val);
        } else {
            System.out.println(node.val);
        }

        prettyDisplay(node.left, indent + 1);

    }

    public void leafCount(){
        System.out.println("No. of Leaf Nodes: " + leafCount(root, 0));
    }
    private int leafCount(Node node, int count){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            count += 1;
            return count;
        }

        int left =  leafCount(node.left, count);
        int right = leafCount(node.right, count);
        return left + right;
    }


}
