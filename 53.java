class Solution {
    public int maxSubArray(int[] nums) {
        //edge cases
        
        //common cases
        int max = nums[0];
        int left=0, right=1;
        int current=nums[left];
        //two-pointer technique, from left to right.
        //analyze from the very beginnng
        //!!!keep possible/potential max, and compare(validate) it.
        while(right<nums.length){
            //max=Math.max(current+nums[right], max) replace IF+ELSE+COMPARE
            if(current+nums[right]>nums[right]){
                current += nums[right];
                max=Math.max(current, max);
            }else{
                current = nums[right];
                left=right;
                max=Math.max(current, max);
            }
            right++;
        }
        return max;
    }
}
