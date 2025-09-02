/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        // find the row which has the item
        int top = 0;
        int bot = row - 1;

        while (top <= bot) {
            // safe midpoint
            row = bot + (top - bot) / 2;
            if (target > matrix[row][col - 1]) {
                top = row + 1;

            } else if (target < matrix[row][0]) {
                bot = row - 1;
            } else {
                break;
            }
        }
        // find the element in the row

        if (top > bot) {
            return false;
        }

        int left = 0;
        int right = col - 1;

        while (left <= right) {
            int midItem = left + (right - left) / 2;
            if (target == matrix[row][midItem]) {
                return true;
            } else if (target < matrix[row][midItem]) {
                right = midItem - 1;
            } else {
                left = midItem + 1;
            }
        }

        return false;

    }
}
// @lc code=end
