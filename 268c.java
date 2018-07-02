class Solution {
    public int missingNumber(int[] nums) {
        boolean[] array = new boolean[nums.length+1];
        for(int num:nums){
            array[num] = true;
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==false)
                return i;
        }
        return -1;
    }
}