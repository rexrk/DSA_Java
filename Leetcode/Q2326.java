package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class Q2326 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(3);
        list.next = null;
        int[][] arr = spiralMatrix(3, 5, list);

        for (int[] ar: arr) {
            System.out.println(Arrays.toString(ar));
        }

    }
    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];

        //direction vector
        int[] direction = {0, 1, 0, -1, 0};
        int d = 0;

        //current pointers
        int row = 0;
        int col = 0;

        //adding first element
        res[row][col] = head.val;
        head = head.next;
        //outer loop upto ?
        int size = res[0].length * res.length;
        //inner loop upto ?
        int length = 0;
        for (int i = 1; i < size; ) {

            //finding length to iterate
            if (d == 0 || d == 2) length = --n;
            else if(d == 1 || d == 3) length = --m;

            for (int k = 0; k < length; k++) {

                row += direction[d];
                col += direction[d + 1];

                if (head != null) {
                    res[row][col] = head.val;
                    head = head.next;

                } else res[row][col] = -1;

                i++;
            }
            d = ++d % 4;

        }

        return res;

    }
}
