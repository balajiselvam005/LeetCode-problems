// 242. Valid Anagram

import java.util.Arrays;

class Solution {

    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         Map<Character, Integer> count = new HashMap<>();
//         for(char ch : s.toCharArray()) {
//             count.put(ch, count.getOrDefault(ch, 0) + 1);
//         }
//         for(char ch : t.toCharArray()) {
//             count.put(ch, count.getOrDefault(ch, 0) - 1);
//         }
//         for(int val : count.values()) {
//             if(val != 0) return false;
//         }
//         return true;
//     }
// }
