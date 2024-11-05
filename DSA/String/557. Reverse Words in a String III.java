// 557. Reverse Words in a String III

class Solution {

    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = 0;
        while (end < arr.length) {
            if (arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
            end++;

        }
        reverse(arr, start, end - 1);

        return new String(arr);
    }

    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
