class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> distToLeastIndexMapping = new HashMap<>();
        int presum = 0;
        int maxLen = 0;
        
        distToLeastIndexMapping.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            presum += nums[i] == 0 ? -1 : 1;
            //find 
            Integer leastIndex = distToLeastIndexMapping.get(presum);
            if (leastIndex != null) {
                maxLen = Math.max(maxLen, i - leastIndex);
            }
            //save
            if (!distToLeastIndexMapping.containsKey(presum)) {
               distToLeastIndexMapping.put(presum, i); 
            }
        }
        
        return maxLen;
    }
}
