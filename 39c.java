class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> temp, int[] candidates, int target, int start){
        int sum=sum(temp);
        if(sum==target){
            list.add(new ArrayList<Integer>(temp));
        }else if(sum<target){
            for(int i=start;i<candidates.length;i++){
            temp.add(candidates[i]);
            backtrack(list, temp, candidates, target, i);
            temp.remove(temp.size()-1);
            }
        }else{
            return;
        }
        
    }
    private int sum(List<Integer> list){
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum += list.get(i);
        }
        return sum;
    }
}