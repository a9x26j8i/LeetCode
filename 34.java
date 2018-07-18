class Solution {
    public int[] searchRange(int[] nums, int target) {
        //edge cases
        //discern int[] against int
        int[] special = {-1,-1};
        if(nums==null||nums.length==0) return special;
        //find smaller ones
        int start=0;
        List<Integer> list =new ArrayList<Integer>();
        //examine the index first!!!
        while(start<nums.length&&nums[start]<target) start++;
        //examine the index first!!!
        while(start<nums.length&&nums[start]==target){
            if(special[0]==-1){
                special[0] = start;
                special[1] = start;
            }else{
                special[1] = start;
            }
            start++;
        } 
        
        

        return special;
    }
}