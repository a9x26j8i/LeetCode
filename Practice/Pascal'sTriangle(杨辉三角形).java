class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            //for initial cases
            if(i>=2){
                for(int j=1; j<list.get(i-1).size(); j++){
                row.add(list.get(i-1).get(j)+list.get(i-1).get(j-1));
                }
            }
            if(i!=0){row.add(1);}   
            list.add(row);
        }
        return list;
    }
}