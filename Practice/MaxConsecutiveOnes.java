class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, temp_max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=1){
                if(temp_max>max) max=temp_max;
                temp_max=0;
            }else{
                temp_max++;
            }
        }
        if(temp_max>max) max=temp_max;
        return max;
    }
}