// 28. Find the Index of the First Occurrence in a String

class Solution {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int len = needle.length();
        if (haystack.length() < len) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - len; i++) {
            if (haystack.substring(i, i + len).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
