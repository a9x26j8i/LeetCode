class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, int start){
        list.add(new ArrayList<Integer>(temp));
        for(int i=start; i<nums.length; i++){
            temp.add(nums[i]);
            //next start = i+1 to ensure the index is increasing, which promises no repetition.
            backtrack(list, temp, nums, i+1);
            temp.remove(temp.size()-1);//reason why it is "backtracking".
        }
        return;
    }
}
