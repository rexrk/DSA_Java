package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q2 {
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

        @Override
        public String toString() {
            return val + " -> " + next;
        }
    }

    public static void main(String[] args) {
        ListNode t2 = new ListNode(3);
        ListNode t1 = new ListNode(4, t2);
        ListNode l1 = new ListNode(2, t1);


        ListNode t4 = new ListNode(4);
        ListNode t3 = new ListNode(6, t4);
        ListNode l2 = new ListNode(5, t3);

        ListNode ans = addTwoNumbers(l1, l2);
        System.out.println(ans);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        int carry = 0;
        ListNode temp = head;
        while(l1 != null || l2 != null || carry == 1) {
            int sum = 0;

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);

            temp.next = node;
            temp = node;

        }
        return head.next;
    }


}
