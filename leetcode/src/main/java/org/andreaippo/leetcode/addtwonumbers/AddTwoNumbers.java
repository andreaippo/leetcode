package org.andreaippo.leetcode.addtwonumbers;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        StringBuilder s1 = new StringBuilder(l1.val);
        StringBuilder s2 = new StringBuilder(l2.val);
        ListNode first = l1;
        ListNode second = l2;
        do {
            s1.insert(0, first.val);
            first = first.next;
        } while (first != null);
        Integer n1 = Integer.parseInt(s1.toString());

        do {
            s2.insert(0, second.val);
            second = second.next;
        } while (second != null);
        Integer n2 = Integer.parseInt(s2.toString());

        String sum = n1 + n2 + "";
        for (int i = 0; i < sum.length(); i++) {
            ListNode current;
            int value = Integer.parseInt(sum.substring(i, i + 1));
            if (i == 0) {
                current = new ListNode(value);
                result.next = current;
            } else if (i != sum.length() - 1) {
                current = new ListNode(value, result.next);
                result.next = current;
            }
            else {
                result.val = value;
            }
        }

        return result;
    }
}
