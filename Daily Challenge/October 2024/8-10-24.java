// 1963. Minimum Number of Swaps to Make the String Balanced

class Solution {

    public int minSwaps(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                res++; 
            }else if (res > 0) {
                res--;
            }
        }
        return (res + 1) / 2;
    }
}
