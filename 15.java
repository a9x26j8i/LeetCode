class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null||nums.length<=2){
            return null;
        }
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int index=0;
        int last = nums[0]+1;
        while(nums[index]<=0){
            List<List<Integer>> result = findTwo(nums, nums[index], index+1, nums.length-1, -nums[index]);
            if(result.size()!=0){
                list.addAll(result);
                last = nums[index];
            }
            do{
               index++; 
            }while(nums[index]==last);
        }
        return list;
    }
    private List<List<Integer>> findTwo(int[] nums,int first, int start, int end, int target){
        List<List<Integer>> list = new ArrayList<>();
        
        while(start<end){
            if(nums[start]+nums[end]<target){
                start++;
            }else if(nums[start]+nums[end]>target){
                end--;
            }else{
                List<Integer> group = new ArrayList<Integer>();
                group.add(new Integer(first));
                group.add(new Integer(nums[start]));
                group.add(new Integer(nums[end]));
                list.add(group);
                start++; end--;
            }
        }
        return list;
    }
}