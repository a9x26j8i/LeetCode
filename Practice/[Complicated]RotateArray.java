class Solution {
    public void rotate(int[] nums, int k) {
        if(nums==null||nums.length<=1){
            return ;
        }
        for(int i=0; i<k; i++){
            oneStep(nums);
        }
    }
    private void oneStep(int[] nums){
        int temp = nums[nums.length-1];
        for(int i=nums.length-1; i>0; i--){//not all elements traversal
            nums[i] = nums[i-1];
        }
        nums[0] = temp;
    }
}