class Solution {
    public boolean canJump(int[] nums) {
        //edge cases
        if(nums==null || nums.length==0){
            return false;
        }
        //common cases
        //traversal from left, refresh the longest position.
        int maxIndex = 0;
        int i=0;
        while(i<=maxIndex && i<nums.length){
            maxIndex = Math.max(maxIndex, i+nums[i]);
            i++;
        }
        if(i==nums.length) return true;
        else return false;
    }
}