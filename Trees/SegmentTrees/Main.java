package Trees.SegmentTrees;

public class Main {
    public static void main(String[] args) {
        var arr = new int[]{3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr);
        tree.display();
        System.out.println(tree.query(1,6));
    }
}