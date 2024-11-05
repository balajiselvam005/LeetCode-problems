// 8. String to Integer (atoi)

class Solution {

    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int index = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }

        StringBuilder str = new StringBuilder();
        while (index < s.length()) {
            char c = s.charAt(index);

            if (!Character.isDigit(c)) {
                break;
            }

            str.append(c);
            index++;
        }

        if (str.length() == 0) {
            return 0;
        }

        long num;
        try {
            num = Long.parseLong(str.toString());
        } catch (NumberFormatException e) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        num = sign * num;

        if (num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) num;
    }
}
