// 729. My Calendar I

import java.util.ArrayList;

class MyCalendar {

    private ArrayList<int[]> a;

    public MyCalendar() {
        a = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] b : a) {
            if (start < b[1] && end > b[0]) {
                return false;
            }
        }
        a.add(new int[]{start, end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such: MyCalendar
 * obj = new MyCalendar(); boolean param_1 = obj.book(start,end);
 */
