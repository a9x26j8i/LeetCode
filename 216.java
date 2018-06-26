class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        //new, construction method!!! need "()"!!!
        backtrack(list, new ArrayList<Integer>(), k, n, 1, n);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> temp, int k, int remain, int start, int n){
        //terminal base
        if(temp.size()==k){
            if(remain==0)
                list.add(new ArrayList<Integer>(temp));
            return;
        }
        //traverse all possible numbers
        for(int i=start; i<10; i++){
            temp.add(i);
            backtrack(list, temp, k, remain-i, i+1, n);
            temp.remove(temp.size()-1);
        }
        return;
    }
}