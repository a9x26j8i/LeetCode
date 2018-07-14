class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int i=0, j=0, min=Integer.MAX_VALUE, sum=0;
        while(i<nums.length){
            sum+=nums[i];
            i++;
            //在while loop 内部进行操作，而不是在大循环中判断。
            //judge and operate in one turn until it's smaller than the sum.
            while(sum>=s){
                min = (i-j<min)? i-j:min;
                sum-=nums[j];
                j++;
            }
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}