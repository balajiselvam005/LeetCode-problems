// 20. Valid Parentheses

import java.util.*;

class Solution {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> m = new HashMap<>(Map.ofEntries(
                Map.entry(')', '('),
                Map.entry('}', '{'),
                Map.entry(']', '[')
        ));
        for (char c : s.toCharArray()) {
            if (m.containsValue(c)) {
                st.push(c); 
            }else if (m.containsKey(c) && (st.isEmpty() || m.get(c) != st.pop())) {
                return false;
            }
        }
        return st.isEmpty();
    }
}
