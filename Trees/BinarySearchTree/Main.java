package Trees.BinarySearchTree;

public class Main {
    public static void main(String[] ar) {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(8);
        bst.insert(1);
        bst.insert(4);
        bst.insert(5);
        bst.insert(26);
        bst.insert(6);
        bst.insert(4);
        bst.insert(7);
        bst.insert(44);
        bst.insert(25);
        bst.insert(255);


        bst.display();
        System.out.println("---------");
        System.out.println(bst.levelOrderSuccessor(255));
    }

}
