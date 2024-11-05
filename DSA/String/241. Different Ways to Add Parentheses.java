// 241. Different Ways to Add Parentheses

import java.util.*;

class Solution {

    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < expression.length(); ++i) {
            char oper = expression.charAt(i);
            if (oper == '+' || oper == '-' || oper == '*') {
                List<Integer> s1 = diffWaysToCompute(expression.substring(0, i));
                List<Integer> s2 = diffWaysToCompute(expression.substring(i + 1));
                for (int a : s1) {
                    for (int b : s2) {
                        switch (oper) {
                            case '+' ->
                                res.add(a + b);
                            case '-' ->
                                res.add(a - b);
                            case '*' ->
                                res.add(a * b);
                            default -> {
                            }
                        }
                    }
                }
            }
        }
        if (res.isEmpty()) {
            res.add(Integer.valueOf(expression));
        }
        return res;
    }
}
