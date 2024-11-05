// 2053. Kth Distinct String in an Array

class Solution {
    public String kthDistinct(String[] a, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for(String s : a){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(String s : a){
            if(map.get(s) == 1){
                list.add(s);
            }
        }
        if (list.size() < k) {
            return "";
        }

        return list.get(k-1);
    }
}