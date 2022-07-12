package org.andreaippo.leetcode.addtwonumbers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    public void test1() {
        ListNode l1_3 = new ListNode(3);
        ListNode l1_2 = new ListNode(4, l1_3);
        ListNode l1_1 = new ListNode(2, l1_2);

        ListNode l2_3 = new ListNode(4);
        ListNode l2_2 = new ListNode(6, l2_3);
        ListNode l2_1 = new ListNode(5, l2_2);

        ListNode result = AddTwoNumbers.addTwoNumbers(l1_1, l2_1);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
    }

}