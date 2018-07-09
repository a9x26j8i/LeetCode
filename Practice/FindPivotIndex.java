class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==0) return -1;
            
        int length = nums.length;
        //core variables should be prepared ahead.
        int left = 0, right =0;
        for(int i=0; i<length; i++){
            right+=nums[i];
        }
        //初始条件想象从结束条件出来
        //assume the start is just after finishing one loop,
        for(int pivot=0; pivot<length; pivot++){
            if(pivot-1>=0)
              left+=nums[pivot-1];
            right-=nums[pivot];
            if(left==right){
                return pivot;
            }
        }
        return -1;
    }
}
    
class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==0) return -1;
            
        int length = nums.length;
        //core variables should be prepared ahead.
        int left = 0, sum =0;
        for(int i=0; i<length; i++){
            sum+=nums[i];
        }
        //初始条件想象从结束条件出来
        //assume the start is just after finishing one loop,
            //succinct version by computing in the running(left+right=sum -> right = sum-right)
        for(int i=0; i<length;i++){
            if(i-1>=0)
                left+=nums[i-1];
            if(sum-left-nums[i]==left)
                return i;
        }
        return -1;
    }
}