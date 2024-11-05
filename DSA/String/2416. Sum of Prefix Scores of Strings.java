// 2416. Sum of Prefix Scores of Strings

// Test Cases passed = 29/38

// class Solution {
//     public int[] sumPrefixScores(String[] words) {
//         int[] res = new int[words.length];
//         int maxLength = 0;

//         for (String word : words) {
//             maxLength = Math.max(maxLength, word.length());
//         }

//         for (int j = 1; j <= maxLength; j++) {
//             for (int i = 0; i < words.length; i++) {
//                 if (words[i].length() >= j) {
//                     String prefix = words[i].substring(0, j);
//                     for (int k = 0; k < words.length; k++) {
//                         if (words[k].length() >= j && words[k].substring(0, j).equals(prefix)) {
//                             res[i] += 1;
//                         }
//                     }
//                 }
//             }
//         }
        
//         return res;
//     }
// }
class Node {
    Map<Character, Pair> umc = new HashMap<>();
    boolean isEnd = false;
}

class Pair {
    int count;
    Node node;

    Pair(int count, Node node) {
        this.count = count;
        this.node = node;
    }
}

class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }

    // Insert word into the Trie
    public void insert(String s) {
        Node cur = root;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!cur.umc.containsKey(c)) {
                cur.umc.put(c, new Pair(0, new Node()));
            }
            cur.umc.get(c).count++;
            cur = cur.umc.get(c).node;
        }
        cur.isEnd = true;
    }

    // Check prefix count of the word
    public int checkPrefixCount(String s) {
        Node cur = root;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!cur.umc.containsKey(c)) {
                break;
            }
            count += cur.umc.get(c).count;
            cur = cur.umc.get(c).node;
        }
        return count;
    }
}

class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie trie = new Trie();
        
        // Insert all words into the Trie
        for (String word : words) {
            trie.insert(word);
        }

        // Collect the prefix scores for each word
        int[] ans = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            ans[i] = trie.checkPrefixCount(words[i]);
        }

        return ans;
    }
}