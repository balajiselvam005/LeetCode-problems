// 809. Expressive Words

class Solution {

    public int expressiveWords(String S, String[] words) {
        int res = 0;

        for (String w : words) {
            if (w.length() > S.length()) {
                continue;
            }

            int i = 0, j = 0;
            while (j < S.length()) {
                if (i < w.length() && w.charAt(i) == S.charAt(j)) {
                    i++;
                    j++;
                } else if (j > 0 && S.charAt(j) == S.charAt(j - 1) && (j + 1 < S.length() && S.charAt(j) == S.charAt(j + 1))) {
                    j++;
                } else if (j > 1 && S.charAt(j) == S.charAt(j - 1) && S.charAt(j) == S.charAt(j - 2)) {
                    j++;
                } else {
                    break;
                }
            }

            if (i == w.length() && j == S.length()) {
                res++;
            }
        }

        return res;
    }
}
