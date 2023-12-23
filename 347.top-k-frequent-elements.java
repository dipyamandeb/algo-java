/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        // create map where Key = number value =frequency
        for (int number : nums) {
            freqMap.put(number, freqMap.getOrDefault(number, 0) + 1);
        }
        // Create a bucket(Array of List), where index is frequency
        // and the content is the number/s
        List<Integer>[] buckets = new List[nums.length + 1];// Array of list
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            Integer number = entry.getKey();
            Integer frequency = entry.getValue();
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(number);
        }
        // Create the result array and populate it
        // with the top k frequent elements
        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[index++] = num;
                    if (index == k) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
// @lc code=end

