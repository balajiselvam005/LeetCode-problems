// 2220. Minimum Bit Flips to Convert Number

class Solution {

    public int minBitFlips(int start, int goal) {
        int res = 0, n = start ^ goal;
        while (n > 0) {
            if (n % 2 == 1) {
                res++;
            }
            n /= 2;
        }
        return res;
    }
}
