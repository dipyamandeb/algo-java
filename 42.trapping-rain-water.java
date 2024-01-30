/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int res = 0;

        if (height.length == 0) {
            return 0;
        }
        // count of the unit blocks that can be trapped
        // two ptrs
        // move the ptr which value is less
        // update the leftMax/rightMax respectively
        // add the diff of leftmax/rightMax minus height[l/r] to res

        int l = 0;
        int r = height.length - 1;

        int leftMax = height[l];
        int rightMax = height[r];

        while (l < r) {
            if (leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }
        return res;
    }
}
// @lc code=end

