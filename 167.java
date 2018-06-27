class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //init the array dynamically(not using {})
        //two points to narrow down the possible combination(s)
        int[] res = new int[2];
        int i = 0, j = numbers.length-1, sum=0;
        while(i<j){
            sum = numbers[i] + numbers[j];
            if(sum>target)
                j--;
            else if(sum<target)
                i++;
            else{
                res[0] = ++i;
                res[1] = ++j;
                break;
            }
        }
        return res;
    }
}
