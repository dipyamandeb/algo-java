/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int currSum = numbers[l] + numbers[r];
            int[] res = new int[2];
            if (target == currSum) {
                res[0] = l + 1;
                res[1] = r + 1;
                return res;
            } else if (currSum > target) {
                r--;
            } else {
                l++;
            }
        }
        return null;
    }
}
// @lc code=end

