class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        int head = 0;
        int minLen = Integer.MAX_VALUE;
        
        for (int tail=0; tail < nums.length; tail++) {
            //add tail
            sum += nums[tail];    
            //examine sum & refreash head
            while(sum > s && sum-nums[head] >= s){
                sum -= nums[head];
                head++;
            }
            //exmine result
            if(sum >= s){
                minLen = Math.min(tail-head+1, minLen);
            }
        }
        if(sum >= s){
            return minLen;
        }else{
            return 0;
        }
    }
}
