class Solution {
    public int findPeakElement(int[] nums) {
        //special cases
        if(nums == null || nums.length == 0){
            return -1;
        }
        
        //length == 1, edge case
        if(nums.length == 1){
            return 0;
        }
        
        //create a window of size 3
        int length = nums.length;
        for(int i=0; i<length; i++){
            if(i==0 && nums[0] > nums[1]){
                return 0;
            }else if(i==length-1 && nums[length-1] > nums[length-2]){
                return length-1;
            }else if(i>0 && i<nums.length-1 && nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                return i;
            }
        }
        return -1;
        
    }
}