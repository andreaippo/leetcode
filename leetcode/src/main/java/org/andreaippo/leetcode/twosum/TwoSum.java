package org.andreaippo.leetcode.twosum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    public static Integer[] twoSum(Integer[] nums, Integer target) {
        Map<Integer, Integer> mapForNumbers = new HashMap<>();
        Integer[] noResult = new Integer[]{-1, -1};
        Integer[] result = new Integer[2];
        if (nums.length < 2) {
            return noResult;
        }
        for (int i = 0; i < nums.length; i++) {
            Integer current = nums[i];
            Integer desired = target - current;
            if (mapForNumbers.containsKey(desired) && mapForNumbers.get(desired) != i) {
                result[0] = mapForNumbers.get(desired);
                result[1] = i;
                return result;
            }
            else {
                mapForNumbers.put(current, i);
            }
        }
        return result;
    }
}
