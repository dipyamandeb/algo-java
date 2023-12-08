/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), (hm.getOrDefault(s.charAt(i), 0) + 1));
        }
        Map<Character, Integer> hm1 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            hm1.put(t.charAt(i), (hm1.getOrDefault(t.charAt(i), 0) + 1));
        }
        return hm.equals(hm1);
    }
}
// @lc code=end

