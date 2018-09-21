class Solution {
    // public int findPeakElement(int[] nums){
    //     return recursion(nums, 0, nums.length-1); 
    // }
    
//     //recursion BINARY SEARCH
//     private int recursion(int[] nums, int left, int right){
//         int middle = left + (right-left)/2;
//         if(left == right){
//             return middle;
//         }
            //利用middle取floor特点，防止indexOutOfBound error
//         if(nums[middle] > nums[middle+1]){
//             return recursion(nums, left, middle);
//         }else{
//             return recursion(nums, middle+1, right);
//         }
//     }
    
    //Iteration BINARY SEARCH
    public int findPeakElement(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        while(left != right){
            middle = left + (right-left)/2;
            //利用middle取floor的特点，left防止indexOutOfBound error
            if(nums[middle] > nums[middle+1]){
                right = middle;
            }else{
                left = middle+1;
            }
        }
        return left;
    }
    
    //Sequential Search
    // public int findPeakElement(int[] nums){
    //     for(int i=1; i < nums.length; i++){
    //         if(nums[i] < nums[i-1]){
    //             return i-1;
    //         }
    //     }
    //     return nums.length-1;
    // }
    
//     //iteration
//     public int findPeakElement(int[] nums) {
//         //special cases
//         if(nums == null || nums.length == 0){
//             return -1;
//         }    
//         //length == 1, edge case
//         if(nums.length == 1){
//             return 0;
//         }
//         //shift all through
//         int length = nums.length;
//         for(int i=0; i<length; i++){
//             if(i==0 && nums[0] > nums[1]){
//                 return 0;
//             }else if(i==length-1 && nums[length-1] > nums[length-2]){
//                 return length-1;
//             }else if(i>0 && i<nums.length-1 && nums[i]>nums[i-1] && nums[i]>nums[i+1]){
//                 return i;
//             }
//         }
//         return -1;
//     }
    
    
}