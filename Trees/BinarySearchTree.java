package Trees;
class BST{
    private static class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value){
            this.value = value;
        }
    }
    private Node root;
    BST(){ }

    public int height(Node node){
        return node == null ? -1 : node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, 0);
    }

    private void display(Node node, int indent) {
        if(node == null){
            return;
        }
        display(node.right, indent + 1);

        if(indent != 0){
            for(int i = 1; i < indent; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----->" + node.value);
        } else {
            System.out.println(node.value);
        }

        display(node.left, indent + 1);
    }

    public void insert(int val){
        insert(root, val);
    }
    private Node insert(Node node, int val){
        if(node == null){
            node = new Node(val);
            return node;
        }
        if(val < node.value){
            node.left = insert(node.left, val);
        }
        if(val > node.value){
            node.right = insert(node.right, val);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

}

public class BinarySearchTree {
    public static void main(String[] args){

    }
}
