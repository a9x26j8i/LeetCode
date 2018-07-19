class Solution {
    //one generate a range, a range generate next range
    public int jump(int[] nums) {
        //edge cases
        if(nums==null||nums.length==0){
            return 0;
        }
        //common cases
        int curMax = 0;
        int nextMax = 0;
        int steps = 0;
        for(int i=0; i<nums.length; i++){
            if(i<=curMax){
                nextMax = Math.max(nextMax, i+nums[i]);
            }else{
                steps++;
                curMax = nextMax;
                //remember to refresh the nextStatusIndex from the changing point
                nextMax = Math.max(nextMax, i+nums[i]);
            }
        }
        return steps;
    }
}