class Solution {
    public int missingNumber(int[] nums) {
        int result = nums.length;
        //using xor between indices and the values.
        for(int i=0; i<nums.length; i++){
            result = result ^ i ^ nums[i];
        }
        return result;
    }
}
