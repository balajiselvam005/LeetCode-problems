// 67. Add Binary

class Solution {

    public String addBinary(String a, String b) {
        int c = 0;
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || c == 1) {
            if (i >= 0) {
                c += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                c += b.charAt(j--) - '0';
            }
            res.append(c % 2);
            c /= 2;
        }
        return res.reverse().toString();
    }
}
