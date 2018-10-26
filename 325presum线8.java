class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> presumToLeastIndex = new HashMap<>();
        int result = 0;
        int sum = 0;
        
        //go through nums
        presumToLeastIndex.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            //lookup
            Integer index = presumToLeastIndex.get(sum-k);
            if(index != null && result < i-index) {
                result = i - index;
            }
            //save
            if (!presumToLeastIndex.containsKey(sum)) {
                presumToLeastIndex.put(sum, i);
            }
        }
        
        return result;
    }
}
