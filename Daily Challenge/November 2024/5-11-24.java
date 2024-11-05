// 2914. Minimum Number of Changes to Make Binary String Beautiful

class Solution {

    public int minChanges(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                res++;
            }
        }
        return res;
    }
}
