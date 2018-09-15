class Solution {
    public int longestConsecutive(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i : nums){
            if(!map.containsKey(new Integer(i))){
                //whenever there is a new integer/key, it's supposed to be on the edge,
                //NO NEED TO update all consecutive key-values
                int left = map.containsKey(i-1)? map.get(i-1) : 0;//refactor like this,
                                                                  //left is 2-choice assignment
                int right = 0;
                if(map.containsKey(i+1)){
                    right = map.get(i+1);
                }
                
                //just update 2 boundary key-values
                map.put(new Integer(i) ,new Integer(left+right+1)  );
                map.put(i-left, left+right+1);
                map.put(i+right, left+right+1);
                
                max = Math.max(max, left+right+1);
            }else{
                continue;
            }
        }
        return max;
    }
}
    
//ARRAY-FILLING:can't store Negative nums, time limit exceed 
//     public int longestConsecutive(int[] nums) {
//         if(nums == null || nums.length == 0){
//             return 0;
//         }
//         int target = nums[0];
//         for(int i:nums){
//             if(i>target){
//                 target = i;
//             }
//         }
//         System.out.println(target);
        
//         boolean[] list = new boolean[target+1];
        
//         for(int i: nums){
//             list[i] = true;
//         }
        
//         int count =0;
//         int max = 0;
//         for(int i=0; i<list.length; i++){
//             if(list[i] == true){
//                 count++;
//                 max = Math.max(count, max);
//             }else{
//                 count = 0;
//             }
//         }
//         return max;
//     }
}