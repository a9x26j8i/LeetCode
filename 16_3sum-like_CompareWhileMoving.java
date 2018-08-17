class Solution {
    public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[nums.length-1];
        int p1, p2;
        for(int i=0; i<nums.length-2; i++){
            if(i==0||nums[i-1]!=nums[i]){
                p1=i+1; p2=nums.length-1;
                //
                //System.out.println(nums[i]+" "+nums[p1]+" "+nums[p2]);
                while(p1<p2){
                    //COMPARE WHILE MOVING
                    int temp = nums[i]+nums[p1]+nums[p2];
                    if(temp>target){
                        p2--;
                    }else{
                        p1++;
                    }
                    if(Math.abs(temp-target)<Math.abs(sum-target)){
                        sum = temp;
                    }
                }
            }
        }
        return sum;
    }
    
    
    
    
//DP: !WRONG
//    public int threeSumClosest(int[] nums, int target) {
//         int[] res = new int[]{nums[0], nums[1], nums[2]};
//         int sum = res[0] + res[1] + res[2];
        
//         int[] temp = new int[]{sum, sum, sum};
//         for(int i=3; i<nums.length; i++){
//             for(int j=0; j<3; j++){
//                 temp[j] = sum - res[j] + nums[i];
//             }
            
//             int smallestI = 0;
//             for(int k=1; k<3; k++){
//                 if(Math.abs(temp[k]-target)<Math.abs(temp[smallestI]-target)){
//                     smallestI = k;
//                 }
//             }
//             res[smallestI] = nums[i];
//             sum = temp[smallestI];
//         }
//     return sum;
//     }
    
}