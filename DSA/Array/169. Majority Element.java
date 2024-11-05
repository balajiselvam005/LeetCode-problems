// 169. Majority Element

import java.util.*;

class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int majorityElement = 0;

        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            if (count > maxCount) {
                maxCount = count;
                majorityElement = num;
            }
        }

        return majorityElement;
    }
}
