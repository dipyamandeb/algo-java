/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = prefix;
            prefix = prefix * nums[i];
        }
        int postFix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = res[i] * postFix;
            postFix = postFix * nums[i];
        }
        return res;
        
    }
}
// @lc code=end

