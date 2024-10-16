// 884. Uncommon Words from Two Sentences

import java.util.HashSet;

class Solution {

    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        String[] arr = new String[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0, j = arr1.length; i < arr2.length; i++, j++) {
            arr[j] = arr2[i];
        }
        HashSet<String> set = new HashSet<>();
        HashSet<String> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!s.isEmpty() && s.contains(arr[i])) {
                continue;
            }
            if (!set.isEmpty() && set.contains(arr[i])) {
                set.remove(arr[i]);
                s.add(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
        String[] res = new String[set.size()];
        int j = 0;
        for (String i : set) {
            res[j] = i;
            j++;
        }
        return res;
    }
}
