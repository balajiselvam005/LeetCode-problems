// 539. Minimum Time Difference

import java.util.*;

class Solution {

    public int findMinDifference(List<String> timePoints) {
        List<Integer> totalMinutes = new ArrayList<>();
        for (String time : timePoints) {
            totalMinutes.add(Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3)));
        }

        Collections.sort(totalMinutes);

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < totalMinutes.size() - 1; i++) {
            res = Math.min(res, totalMinutes.get(i + 1) - totalMinutes.get(i));
        }

        res = Math.min(res, 24 * 60 - totalMinutes.get(totalMinutes.size() - 1) + totalMinutes.get(0));

        return res;
    }
}
