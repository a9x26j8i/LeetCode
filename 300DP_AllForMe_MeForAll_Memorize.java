class Solution {
    public int lengthOfLIS(int[] nums) {
        //DP AllForMe人人为我 
        if(nums == null || nums.length == 0){
            return 0;
        }
        int[] maxAtEnd = new int[nums.length];
        maxAtEnd[0] = 1;
        int ret = maxAtEnd[0];
        for(int i=0; i<nums.length; i++){
            maxAtEnd[i] = 1;
            for(int j=0; j<i; j++){
                if(nums[j] < nums[i]){
                    maxAtEnd[i] = Math.max(maxAtEnd[j]+1, maxAtEnd[i]);
                }
            }
            ret = Math.max(maxAtEnd[i], ret);
        }
        return ret;
    }
    
    // public int lengthOfLIS(int[] nums){
    //     //DP MeForAll我为人人
    //     if(nums == null || nums.length == 0){
    //         return 0;
    //     }
        
    //     int[] maxAtEnd = new int[nums.length];
    //     for(int i=0; i<maxAtEnd.length; i++){
    //         maxAtEnd[i] = 1;
    //     }
    //     int ret = 1;
    //     for(int i=0; i < nums.length; i++){
    //         for(int j=i+1; j < nums.length; j++){
    //             if(nums[i] < nums[j]){
    //                 maxAtEnd[j] = Math.max(maxAtEnd[j], maxAtEnd[i]+1);
    //             }
    //         }    
    //         if(maxAtEnd[i] > ret){
    //             ret = maxAtEnd[i];
    //         }
    //     }
    //     return ret;
    // }
}