 /*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        // max area = lenght * breadth
        // breadth is dist. between two vertical lines
        // length will be the min of two vertical lines
        // move the pointer away from the smallest of the two vertical lines

        int l = 0;
        int r = height.length - 1;

        int res = 0;

        while (l < r) {
            int area = (r - l) * Math.min(height[r], height[l]);
            res = Math.max(res, area);

            // move the ptr
            if (height[l] < height[r]) {
                l++;

            } else {
                r--;
            }
        }
        return res;
    }
}
// @lc code=end

