// 1684. Count the Number of Consistent Strings

class Solution {

    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        boolean[] b = new boolean[26];
        for (Character c : allowed.toCharArray()) {
            b[c - 'a'] = true;
        }
        for (String word : words) {
            if (isConsistent(word, b)) {
                res++;
            }
        }
        return res;
    }

    boolean isConsistent(String str, boolean[] b) {
        for (int i = 0; i < str.length(); i++) {
            if (!b[str.charAt(i) - 'a']) {
                return false;
            }
        }
        return true;
    }
}

// class Solution {
//     public int countConsistentStrings(String allowed, String[] words) {
//         int res = 0;
//         for(String s : words){
//             if(isConsistent(s, allowed)) res++;
//         }
//         return res;
//     }
//     boolean isConsistent(String str, String allow){
//         for(int i=0; i<str.length(); i++){
//             if(!allow.contains(Character.toString(str.charAt(i)))) return false;
//         }
//         return true;
//     }
// }
