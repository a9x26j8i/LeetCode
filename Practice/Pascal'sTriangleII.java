class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        if(rowIndex==0){
            return list;
        }
        list.add(1);
        if(rowIndex==1){
            return list;
        }
        for(int i = 2; i<=rowIndex; i++){
            list.add(1);
            //if traversal from left to right can't work, try from right to left.
            for(int j=i-1; j>=1; j--){
                list.set(j, list.get(j-1)+list.get(j));
            }
        }
        return list;
    }
}