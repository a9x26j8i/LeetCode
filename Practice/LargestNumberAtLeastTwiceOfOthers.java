class Solution {
    public int dominantIndex(int[] nums) {
        int largest=Integer.MIN_VALUE+1, seclarg=Integer.MIN_VALUE;
        int index=0;
        if(nums.length==1){
            return 0;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                seclarg=largest;
                largest = nums[i];
                index=i;
            }else if(nums[i]>seclarg){
                seclarg = nums[i];
            }
        }
        if(largest>=seclarg*2)
            return index;
        return -1;
    }
}