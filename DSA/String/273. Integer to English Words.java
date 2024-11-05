// 273. Integer to English Words

import java.util.HashMap;

class Solution {

    public String numberToWords(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> bigMap = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19, "Nineteen");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");
        map.put(60, "Sixty");
        map.put(70, "Seventy");
        map.put(80, "Eighty");
        map.put(90, "Ninety");

        bigMap.put(100, "Hundred");
        bigMap.put(1000, "Thousand");
        bigMap.put(1000000, "Million");
        bigMap.put(1000000000, "Billion");

        if (num == 0) {
            return "Zero";
        }

        StringBuilder result = new StringBuilder();
        int i = 1;

        while (num > 0) {
            int digit = num % 1000;
            if (digit != 0) {
                String digitStr = handleBelowThousand(digit, map);
                String bigMapStr = getBigMapWord(i, bigMap);
                result.insert(0, digitStr + (bigMapStr.isEmpty() ? "" : " " + bigMapStr) + " ");
            }
            num /= 1000;
            i *= 1000;
        }

        return result.toString().trim();
    }

    private String handleBelowThousand(int num, HashMap<Integer, String> map) {
        StringBuilder result = new StringBuilder();
        if (num >= 100) {
            result.append(map.get(num / 100)).append(" Hundred ");
            num %= 100;
        }
        if (num >= 20) {
            result.append(map.get(num / 10 * 10)).append(" ");
            num %= 10;
        }
        if (num > 0) {
            result.append(map.get(num)).append(" ");
        }
        return result.toString().trim();
    }

    private String getBigMapWord(int i, HashMap<Integer, String> bigMap) {
        return bigMap.get(i) != null ? bigMap.get(i) : "";
    }

}
