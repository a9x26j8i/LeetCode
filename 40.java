class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, result, new ArrayList<Integer>(), target, 0);
        return result;
    }
    private void backtrack(int[] nums, List<List<Integer>> result, List<Integer> temp, int remain, int start){
        if(remain==0){
            result.add(new ArrayList<Integer>(temp));
            return;
        }else if(remain<0){
            return;
        }else{
            //backtracking of position
            //no duplicates(refering to same value different ids) in the same position
            //one position one element, different ids with same value can't exchange(no duplicates)
            for(int i=start; i<nums.length; i++){
                if(i!=start && nums[i]==nums[i-1]){
                    //not return, continue to try other nums;
                    continue;
                }
                temp.add(nums[i]);
                backtrack(nums, result, temp, remain-nums[i], i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}