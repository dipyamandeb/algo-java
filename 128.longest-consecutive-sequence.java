/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for (int num : nums) {
            mySet.add(num);
        }

        int longSeq = 0;

        for (int n : nums) {
            if (!mySet.contains((n - 1))) {
                int length = 0;
                while (mySet.contains(n + length)) {
                    length++;
                }
                longSeq = Math.max(length, longSeq);
            }

        }

        return longSeq;
    }
}
// @lc code=end

