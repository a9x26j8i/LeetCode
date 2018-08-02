class Solution { 
    //one-pass algo1: Crane-like & multi-pointer 
    public void sortColors(int[] nums){
        int red=-1, white=-1, blue=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                nums[++blue] = 2;
                nums[++white] = 1;
                nums[++red] = 0;
            }else if(nums[i] == 1){
                nums[++blue] = 2;
                nums[++white] = 1;
            }else{
                nums[++blue] = 2;
            }
        }
    }

    // one-pass algo2: multi-pointer & double-end
    // public void sortColors(int[] nums){
    //     int front=0, back=nums.length-1;
    //     for(int i=0; i<=back; i++){
    //         if(nums[i] == 0){
    //             nums[i] = nums[front];
    //             nums[front]=0;
    //             front++;
                
    //         }
    //         if(nums[i] == 2){
    //             nums[i] = nums[back];
    //             nums[back] = 2;
    //             back--;
    //             i--;
    //         }
    //     }
    // }
}