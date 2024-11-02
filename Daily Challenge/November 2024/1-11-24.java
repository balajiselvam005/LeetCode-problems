// 1957. Delete Characters to Make Fancy String

class Solution {

    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        int n = s.length(), count = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == str.charAt(str.length() - 1)) {
                count++;
                if (count < 3) {
                    str.append(s.charAt(i));
                }
            } else {
                count = 1;
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
