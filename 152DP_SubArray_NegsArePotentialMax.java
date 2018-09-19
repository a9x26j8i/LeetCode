class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null || nums.length == 0){
            return 0;
        }
        int max = nums[0];
        int min = nums[0];
        int ret = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] == 0){
                max = 0;
                min = 0;
                continue;
            }else{
                int temp = max;
//for SUB-ARRAY problems, should we abandon pre-array and restart?(is so, you can compare the ) not should we add more or restart.(if so, you   have no pre-array to compare)
                max = Math.max(Math.max(min*nums[i], max*nums[i]), nums[i]);  // 正线比较，记录最正信息
                min = Math.min(Math.min(min*nums[i], temp*nums[i]), nums[i]);  // 比较潜力信息，记录最有潜力信息
            }       
            ret = Math.max(max, ret);
        }
        return ret;
    }
}