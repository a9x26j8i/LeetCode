class Solution {
    //Kadane's Algorithm
    public int maxSubArray(int[] nums) {
        int maxCur=nums[0], maxSoFar=nums[0];
        //DP: Examine all subarrays ending at each elements.
        //
        for(int i=1; i<nums.length; i++){
            maxCur = Math.max(maxCur+nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxCur);
        }
        return maxSoFar;
    }
}