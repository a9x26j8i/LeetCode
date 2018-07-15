class Solution {
    //two-pointer technique + thinking progressively
    public int maxArea(int[] height){
        if(height==null||height.length<=1){
            return 0;
        }
        int left=0, right=height.length-1;
        int max=-1;
        while(left<right){
            if(max<Math.min(height[left], height[right])*(right-left)){
                max = Math.min(height[left], height[right])*(right-left);
            }
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }