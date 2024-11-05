// 443. String Compression

class Solution {

    public int compress(char[] chars) {
        int count = 1;
        int index = 0;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                chars[index++] = chars[i - 1];
                if (count > 1) {

                    for (char digit : Integer.toString(count).toCharArray()) {
                        chars[index++] = digit;
                    }
                }
                count = 1;
            }
        }

        chars[index++] = chars[chars.length - 1];
        if (count > 1) {
            for (char digit : Integer.toString(count).toCharArray()) {
                chars[index++] = digit;
            }
        }

        return index;
    }
}
