/*
 * @lc app=leetcode id=1011 lang=java
 *
 * [1011] Capacity To Ship Packages Within D Days
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        // 1. minimum capacity of ships wrt days
        // 2. probable minimum capacity of ship wil be the max weight i.e.10
        // 3. max capacity of ship will be Sum(weights)
        // 4. minimum capacitiy will lie between probable minimum and max
        // so binary search will be implemented
        // 5. TC:Onlogm
        // Approach
        // 1st we will find number of days it require to ship
        // of specific capacity to ship transport the weights
        // next we will put binary search wrt 2 and 3 to get the 4.
        // Note: If you notice 3 parameters days, capacity , weight,
        // combine 2 and get the 3rd and put BS on the 3 rd
        int left =  Arrays.stream(weights).max().getAsInt(); 
        int right = Arrays.stream(weights).sum();

        while (left < right) {

            int mid = (left + right) / 2;

            int numOfDays = numberOfDays(weights, mid);

            if (numOfDays <= days) {
                right = mid ;
            } else {
                left = mid + 1;
            }

        }

        return left;
    }

    int numberOfDays(int[] weights, int capacity) {
        int days = 1;//even if everything fits in one go, it should return 1
        int load = 0;

        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > capacity) {
                days = days + 1;
                load = weights[i];
            } else {
                load = load + weights[i];
            }
        }
        return days;
    }
}
// @lc code=end

