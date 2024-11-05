// 599. Minimum Index Sum of Two Lists

import java.util.*;

class Solution {

    public String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length > list2.length) {
            return findRestaurant(list2, list1);
        }
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> res = new ArrayList<String>();
        int m = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length && i <= m; i++) {
            if (map.containsKey(list2[i])) {
                int s = i + map.get(list2[i]);
                if (s < m) {
                    m = s;
                    res.clear();
                    res.add(list2[i]);
                } else if (s == m) {
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[0]);
    }
}
