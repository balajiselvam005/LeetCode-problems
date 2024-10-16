// 476. Number Complement

class Solution {

    public int findComplement(int num) {
        if (num == 0) {
            return 1;
        }
        return (int) (Math.pow(2, Integer.toBinaryString(num).length()) - 1) - num;
    }
}
