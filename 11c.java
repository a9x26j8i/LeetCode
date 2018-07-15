class Solution {
  public int maxArea(int[] height) {
        //O(n^2) brute force
        int length = height.length;
        int i,j,result=0, temp;
        for(i=0; i<length; i++){
            for(j=i+1; j<length; j++){
                temp = (j-i)*Math.min(height[j], height[i]);
                if(temp>result) result = temp;
            }
        }
        return result;
    }
}