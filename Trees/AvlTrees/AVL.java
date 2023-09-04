package Trees.AvlTrees;

class AVL {
    private static class Node {
        int val;
        int height;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    private Node root;

    public void height() {
        int height = Math.max(height(root.left), height(root.right));
        System.out.println(height);
    }
    private int height (Node node) {
        if (node == null) {
            return  -1;
        }
        return node.height;
    }

    public void insert (int val) {
        root = insert(root, val);
    }
    private Node insert(Node node, int val){
        if(node == null){
            node = new Node(val);
            return node;
        }
        if(val < node.val){
            node.left = insert(node.left, val);
        }
        if(val > node.val){
            node.right = insert(node.right, val);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node) {
        if(height(node.left) - height(node.right) > 1) {
            if(height(node.left.left) - height(node.left.right) > 0) {
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

        }
        if(height(node.left) - height(node.right) < -1) {
            if(height(node.right.right) - height(node.right.left) > 0) {
                return leftRotate(node);
            }
            if(height(node.right.right) - height(node.right.left) < 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }

        }
        return node;
    }

    private Node leftRotate(Node node) {
        Node temp = node.right;
        node.right = temp.left;

        temp.left = node;
        return temp;
    }

    private Node rightRotate(Node parent) {
        Node child = parent.left;
        parent.left = child.right;
        
        child.right = parent;

        parent.height = Math.max(height(parent.left), height(parent.right)) + 1;
        child.height = Math.max(height(child.left), height(child.right)) + 1;


        return child;
        
    }

    public void display(){
        display(root, 0);
    }

    private void display(Node node, int indent) {
        if(node == null){
            return;
        }
        display(node.right, indent + 1);
        if(indent != 0) {
            for (int i = 1; i < indent; i++) {
            System.out.print("|\t");
            }
            System.out.println("|-->" + node.val);
        } else {
            System.out.println(node.val + "]");
        }
        display(node.left, indent+1);

    }
}

