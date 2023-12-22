/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int res = nums[0];
        
        while (l <= r) {
            // sorted part
            if (nums[l] < nums[r]) {
                return Math.min(nums[l], res);
            }
            int mid = (r + l) / 2;
            res = Math.min(res, nums[mid]);
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }
}
// @lc code=end

