// 520. Detect Capital

class Solution {

    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        }
        if (word.equals(word.toLowerCase())) {
            return true;
        }
        if (word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }
        return false;
    }
}
