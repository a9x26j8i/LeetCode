class Solution {
    public int search(int[] nums, int target) {
        //edge case
        if(nums==null||nums.length==0) return -1;
        
        int bigger = nums[0], smaller = nums[nums.length-1];
        int start = 0, end = nums.length-1;
        // start<=end matches up with middle=(start+end)/2+1 OR middle=(start+end)/2-1
        while(start<=end){
            if(target>=bigger){
                if(nums[(start+end)/2]<bigger || target<nums[(start+end)/2]){
                    end = (start+end)/2-1;
                }else if(target==nums[(start+end)/2]){
                    return (start+end)/2;
                }else{
                    start=(start+end)/2+1;
                }
                continue;
            } 
            if(target<=smaller){
                if(nums[(start+end)/2]>smaller || nums[(start+end)/2]<target){
                    start = (start+end)/2+1;
                }else if(target==nums[(start+end)/2]){
                    return (start+end)/2;
                }else{
                    end = (start+end)/2-1;
                }
                continue;
            }
            return -1;
        }
        return -1;
    }
}