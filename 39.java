class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
        return list;
    }
    //caculate remain in each iteration instead of using a sum function
    private void backtrack(List<List<Integer>> list, List<Integer> temp, int[] candidates, int remain, int start){
        //when reamin<=0, terminate it 
        if(remain==0){
            list.add(new ArrayList<Integer>(temp));
        }else if(remain>0){
            for(int i=start;i<candidates.length;i++){
            temp.add(candidates[i]);
            backtrack(list, temp, candidates, remain-candidates[i], i);
            temp.remove(temp.size()-1);
            }
        }else{
            return;
        }
        
    }
}