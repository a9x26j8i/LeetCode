class Solution {
    public List<List<String>> partition(String s) {
        //initialize lists with ArrayList<>()
        List<List<String>> list = new ArrayList<>();
        backtrack(list, new ArrayList<String>(), s, 0);
        return list;
    }
    private void backtrack(List<List<String>> list, List<String> temp, String remain, int start){
        //terminal condition
        if(start==remain.length()){
            list.add(new ArrayList<String>(temp));            
            return;
        //traverse all possibility and backtrack(restore)
        }else{
            for(int i=start; i<remain.length();i++){
                String str = remain.substring(start, i+1);
                if(isPalindrome(str)){
                    temp.add(str);
                    backtrack(list, temp, remain, i+1);
                    temp.remove(temp.size()-1);
                }
            }
        }
        return;
    }
        
    private boolean isPalindrome(String str){
        int i=0, j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;    
    }
}