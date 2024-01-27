/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort the array
        // get the baseSum = nums [i]
        // two pointer approach inside for loop
        // avoid duplicate on left pointer
        // since we are moving sequentially

        List<List<Integer>> res = new ArrayList();

        // sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // avoids duplicate in left
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            // 2 ptr inside for loop
            int l = i + 1;
            int r = nums.length - 1;
            int baseSum = nums[i];
            while (l < r) {
                int target = baseSum + nums[l] + nums[r];
                if (target < 0) {
                    l++;
                } else if (target > 0) {
                    r--;
                } else {
                    // this combination must be stored
                    res.add(new ArrayList<Integer>(Arrays.asList(baseSum, nums[l], nums[r])));
                    l++;
                    // to avoid duplicate in left pointer
                    while (nums[l - 1] == nums[l] && l < r) {
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
// @lc code=end

