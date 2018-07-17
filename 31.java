class Solution {
    public void nextPermutation(int[] nums) {
        //edge cases
        if(nums==null || nums.length<=1){
            return;
        }
        
        //find rightmost inversion pair
        int i=nums.length-1;
        while(i-1>=0){
            if(nums[i-1]<nums[i]){
                //find the smallest element in the right part
                int si=smallestIndex(nums, i);    
                swap(nums, i-1, si);
                //sort the right part
                Arrays.sort(nums, i, nums.length);
                return ;
            }
            i--;
        }
        
        
        // if no inversion pair was found, reverse the whole array
        int start=0, end=nums.length-1;
        while(start<end){
            swap(nums, start, end);
            start++;end--;
        }
        return ;
        
    }
    
    //swap two numbers in an array
    private void swap(int[] nums, int left, int right){
        int temp;
        temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
    //find the smallest element
    private int smallestIndex(int[] nums, int pivotI){
        int si = pivotI;
        while(pivotI<nums.length){
            if(nums[pivotI]<nums[si]){
                si=pivotI;
            }
            pivotI++;
        }
        return si;
    }
}