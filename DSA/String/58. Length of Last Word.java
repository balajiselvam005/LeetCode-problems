// 58. Length of Last Wor

class Solution {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = s.length();
        if (!s.contains(" ")) {
            return s.length();
        }
        int length = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                length++;
            }
        }
        return length;
    }
}
