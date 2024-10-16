// 1945. Sum of Digits of String After Convert

class Solution {

    public int getLucky(String s, int k) {
        int res = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(Integer.toString((int) s.charAt(i) - 96));
        }
        for (int i = 0; i < sb.length(); i++) {
            res += sb.charAt(i) - '0';
        }

        while (k > 1) {
            String str = Integer.toString(res);
            res = 0;
            for (int i = 0; i < str.length(); i++) {
                res += str.charAt(i) - '0';
            }
            --k;
        }
        return res;
    }
}
