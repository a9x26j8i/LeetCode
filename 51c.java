class Solution {

    public static List<List<Integer>> result = new ArrayList<>();
    public static int num;
    
    public List<List<String>> solveNQueens(int n){
        num = n;
        backtrack(0, new ArrayList<Integer>());
        return translate(result);
    }
    //backtrack method
    private void backtrack(int currentrow, List<Integer> temp){
        if(currentrow == num){
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=0;i<num;i++){
            temp.add(i);
            if(isValid(temp))
                backtrack(currentrow+1, temp);
            temp.remove(temp.size()-1);
        }
    }
    //verify if current board is valid or not
    private boolean isValid(List<Integer> temp){
        int row = temp.size()-1;
        int column = temp.get(row);
        for(int i=0; i<row;i++){
            if(temp.get(i)==column)
                return false;
            if(Math.abs(row-i) == Math.abs(temp.get(i)-column))
                return false;
        }
        return true;
    }
    //translate from list<Integer> to list<String> to print
    private List<List<String>> translate(List<List<Integer>> result){
        List<List<String>> rr = new ArrayList<>();
        System.out.println("result:"+result.size());
        if(result.size()>0){
            for(List<Integer> board : result){
            List<String> newboard = new ArrayList<String>();   
            for(int i=0; i<num; i++){
                String s = "";
                for(int j=0;j<num;j++){
                    if(j==board.get(i))
                        s += 'Q';
                    else 
                        s += '.'; 
                }
                newboard.add(s);
            }
            rr.add(newboard);
        }
        }
        
        return rr;
    }
}