package Trees.BinarySearchTree;

public class Main {
    public static void main(String[] ar) {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(8);
        bst.insert(1);
        bst.insert(4);


        bst.display();
        System.out.println(bst.serialize());
    }

}
