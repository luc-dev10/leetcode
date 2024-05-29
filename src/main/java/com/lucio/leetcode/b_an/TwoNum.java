package com.lucio.leetcode.b_an;

class TwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode prev = null;

        int carry = 0;
        int remainder = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int total = carry;

            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }

            // set next value
            carry = total / 10;
            remainder = total % 10;

            ListNode curr = new ListNode(remainder);
            if (prev != null) prev.next = curr;
            else {
                head = curr;
            }

            prev = curr;
        }

        return head;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {this.val = val;}

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}