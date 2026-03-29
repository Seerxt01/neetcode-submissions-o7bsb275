class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> map = new HashMap<>();
        for ( String s :strs ){
            int[] freq = new int[26];
            for (char c : s.toCharArray()){
            freq[ c- 'a']++;
            }

            StringBuilder key = new StringBuilder();
            for (int count : freq){
                key.append('#').append(count);
            }

            String k = key.toString();

            if (!map.containsKey(k)){
                map.put(k, new ArrayList<>());
            }
            map.get(k).add(s);

        }
        return new ArrayList<>(map.values());
        
    }
}
