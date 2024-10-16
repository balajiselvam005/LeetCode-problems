// 624. Maximum Distance in Arrays

import java.util.List;

class Solution {

    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0), max = arrays.get(0).get(arrays.get(0).size() - 1);
        int amin = 0, amax = 0;
        int result = 0;
        for (int i = 1; i < arrays.size(); i++) {
            amin = arrays.get(i).get(0);
            amax = arrays.get(i).get(arrays.get(i).size() - 1);

            result = Math.max(result, Math.max(Math.abs(amax - min), Math.abs(max - amin)));

            min = Math.min(min, amin);
            max = Math.max(max, amax);

        }
        return result;
    }
}
