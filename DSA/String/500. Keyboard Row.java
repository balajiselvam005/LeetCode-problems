// 500. Keyboard Row

import java.util.*;

class Solution {

    public String[] findWords(String[] words) {
        String[] s = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        int c;
        List<String> res = new ArrayList<>();

        for (String word : words) {
            for (int i = 0; i < 3; i++) {
                c = 0;
                for (int j = 0; j < word.length(); j++) {
                    for (int k = 0; k < s[i].length(); k++) {
                        if (Character.toLowerCase(word.charAt(j)) != s[i].charAt(k)) {
                            continue;
                        }
                        c++;
                        break;
                    }
                }
                if (c == word.length()) {
                    res.add(word);
                }

            }
        }
        return res.toArray(String[]::new);
    }
}
