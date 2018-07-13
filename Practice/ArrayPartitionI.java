class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums==null){
            return 0;
        }
        Arrays.sort(nums);
        int i = nums.length-1-1;
        int sum=0;
        while(i>=0){
            sum += nums[i];
            i = i-2;
        }
        return sum;
    }
}