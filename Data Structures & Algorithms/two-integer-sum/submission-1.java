class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // What number do we need?
            
            // Step 3: If we've already seen that number, we found our pair!
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // Return both indices
            }
            
            // Step 4: Otherwise, remember this number and its index for later
            map.put(nums[i], i);
        }
        
        // Return empty if no solution is found
        return new int[]{};
    }
    
}
