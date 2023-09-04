package Trees.SegmentTrees;

public class SegmentTree {
    private static class Node {
        int val;
        int sInterval;
        int eInterval;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

        public Node(int sInterval, int eInterval) {
            this.sInterval = sInterval;
            this.eInterval = eInterval;
        }
    }

    private Node root;

    public SegmentTree(int[] arr) {
        this.root = populateHelper(arr, 0, arr.length-1);
    }

    private Node populateHelper(int[] arr, int sInterval, int eInterval) {
        if(sInterval >= eInterval) {
            Node node = new Node(sInterval, eInterval);
            node.val = arr[sInterval];
            return node;
        }

        Node node = new Node(sInterval, eInterval);
        int mid = sInterval + (eInterval-sInterval) / 2;

        node.left = this.populateHelper(arr, sInterval, mid);
        node.right = this.populateHelper(arr, mid+1, eInterval);
        node.val = node.left.val + node.right.val;

        return node;
    }

    public void display() {
        System.out.println("Interval\t" + "Data\t" + "< Left\t" + "Right >");
        display(this.root);
    }
    private void display(Node node) {
        if(node == null) {
            return;
        }
        System.out.print("[" + node.sInterval + " - " + node.eInterval + "] \t");
        System.out.print(node.val + "\t");
        if(node.sInterval < node.eInterval) {
            System.out.print(node.left.val + "\t" + node.right.val);

        } else {
            System.out.print("X\t" + "X");
        }

        System.out.println();
        display(node.left);
        display(node.right);
    }

    public int query(int sI, int eI) {
        return this.query(this.root, sI, eI);
    }
    private int query(Node node, int sI, int eI) {
        if(node.sInterval >= sI && node.eInterval <= eI) {
            return node.val;
        }
        else if(node.sInterval > eI || node.eInterval < sI) {
            return 0;
        }
        else {
            return query(node.left, sI, eI) + query(node.right, sI, eI);
        }
    }
}
