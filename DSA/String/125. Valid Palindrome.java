// 125. Valid Palindrome

class Solution {

    public boolean isPalindrome(String ss) {
        String s = ss.toLowerCase();
        int i = 0, j = s.length() - 1;
        boolean result = false;
        if (i == j) {
            return true;
        }
        while (i < j) {
            char c = s.charAt(i);
            char d = s.charAt(j);
            if (((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) && ((d >= 'a' && d <= 'z') || (d >= '0' && d <= '9'))) {
                if (c == d) {
                    result = true;
                } else {
                    return false;
                }
            } else {
                if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                    j--;
                } else {
                    i++;
                }
            }
            if (result == true) {
                result = false;
                i++;
                j--;
            }
        }
        return true;
    }
}
