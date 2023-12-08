/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int otherValue = target - nums[i];
            if (hm.containsKey(otherValue)) {
                int otherIndex = hm.get(otherValue);
                return new int[] { otherIndex, i };
            }
            hm.put(nums[i], i);
        }
        return null;
    }
}
// @lc code=end

