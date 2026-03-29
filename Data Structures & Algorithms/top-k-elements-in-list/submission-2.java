class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap <Integer , Integer> map = new HashMap<>();
       for ( int num : nums){
        map.put(num, map.getOrDefault(num,0) + 1);
       } 
       List<Map.Entry<Integer,Integer>> list =
                new ArrayList<>(map.entrySet());

        // sort by frequency (descending)
        list.sort((a,b) -> b.getValue() - a.getValue());

        int[] result = new int[k];

        // pick first k elements
        for(int i = 0; i < k; i++){
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}
