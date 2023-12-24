/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // hashset for row, col, square
        Set set = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j] + " at row" + i)
                        || set.contains(board[i][j] + " at column" + j)
                        || set.contains(board[i][j] + " at square" + i / 3 + "-" + j / 3)) {
                    return false;
                }
                set.add(board[i][j] + " at row" + i);
                set.add(board[i][j] + " at column" + j);
                set.add(board[i][j] + " at square" + i / 3 + "-" + j / 3);

            }
        }
        return true;
    }
}
// @lc code=end

