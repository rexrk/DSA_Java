package Trees.BinaryTree;

import Trees.BinaryTree.BinaryTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(in);
        tree.prettyDisplay();

    }
}