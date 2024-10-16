// 860. Lemonade Change

class Solution {

    public boolean lemonadeChange(int[] bills) {
        int[] a = new int[2];
        for (int bill : bills) {
            if (bill == 5) {
                a[0]++;
            } else if (bill == 10) {
                a[1]++;
                a[0]--;
                if (a[0] < 0) {
                    return false;
                }
            } else {
                if (a[1] == 0 && a[0] > 2) {
                    a[0] -= 3;
                } else if (a[1] > 0 && a[0] > 0) {
                    a[1]--;
                    a[0]--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
