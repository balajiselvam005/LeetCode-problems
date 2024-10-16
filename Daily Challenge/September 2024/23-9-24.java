// 2707. Extra Characters in a String

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        Set<String> set = new HashSet<>();
        for (String word : dictionary) {
            set.add(word);
        }

        int[] res = new int[n + 1];

        for (int i = n - 1; i >= 0; --i) {
            res[i] = res[i + 1] + 1;
            for (int j = 1; j <= n - i; ++j) {
                String substr = s.substring(i, i + j);
                if (set.contains(substr)) {
                    res[i] = Math.min(res[i], res[i + j]);
                }
            }
        }
        return res[0];
    }
}
