package org.andreaippo.leetcode.twosum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TwoSumTest {

    @Test
    public void test1() {
        Integer[] nums = new Integer[]{2, 7, 11, 15};
        Integer target = 9;
        Integer[] result = TwoSum.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void test2() {
        Integer[] nums = new Integer[]{3, 2, 4};
        Integer target = 6;
        Integer[] result = TwoSum.twoSum(nums, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void test3() {
        Integer[] nums = new Integer[]{3, 3};
        Integer target = 6;
        Integer[] result = TwoSum.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }


    @Test
    public void test4() {
        Integer[] nums = new Integer[]{-3, 13, 23, -12};
        Integer target = 11;
        Integer[] result = TwoSum.twoSum(nums, target);
        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
    }


}