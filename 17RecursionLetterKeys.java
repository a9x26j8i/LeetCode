class Solution {
    private static final char[][] chars = new char[][]{
            {},
            {},
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'},
        };
    //OR 
    //private static final String[] KEYS = {"", "" ,"abc","def","ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    //in association with KEYS.charAt(index);
    public List<String> letterCombinations(String digits) {
        List<String> ret = new LinkedList<>();
        if(digits.length() == 0) return ret;
        recursion(digits, 0, "", ret);
        return ret;
    }
    public void recursion(String digits, int pos, String pre, List<String> list){
        if(pre.length() == digits.length()){
            list.add(pre);
            return;
        }
        int index = digits.charAt(pos)-'0';
        for(int i=0; i<chars[index].length; i++){
            recursion(digits, pos+1, pre + chars[index][i], list);
        }
    }
}