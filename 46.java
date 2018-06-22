class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<Integer>(), nums);
        return list;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums)     {
        //if temp is a leaf node, store & return
        if(temp.size()==nums.length){
            result.add(new ArrayList<Integer>(temp));//need to CONSTRUCT a NEW OBJECT instead of referencing to a List<Integer>
            return;
        }

        //traverse its children & traceback(using temp.remove())
        for(int i=0; i<nums.length; i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]); 
                backtrack(result, temp, nums);
                temp.remove(temp.size()-1);
            }
        }
    }
}