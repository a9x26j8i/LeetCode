class Solution {
    //FIFO/QUEU
    public List<String> letterCombinations(String digits){
        String[] mapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        LinkedList<String> list = new LinkedList<>();
        if(digits.length()==0) return list;
        list.addFirst("");
        
        while(list.peek().length()<digits.length()){
            int curLength = list.peek().length(); 
            String temp = list.remove();
            String map = mapping[digits.charAt(curLength)-'0'];
            
            for(char c : map.toCharArray()){
                list.addLast(temp+c);
            }
        }
        return list;
    }
    
//     RECURSION
//     private static final char[][] chars = new char[][]{
//             {},
//             {},
//             {'a', 'b', 'c'},
//             {'d', 'e', 'f'},
//             {'g', 'h', 'i'},
//             {'j', 'k', 'l'},
//             {'m', 'n', 'o'},
//             {'p', 'q', 'r', 's'},
//             {'t', 'u', 'v'},
//             {'w', 'x', 'y', 'z'},
//         };
//     //OR 
//     //private static final String[] KEYS =
//     public List<String> letterCombinations(String digits) {
//         List<String> ret = new LinkedList<>();
//         if(digits.length() == 0) return ret;
//         recursion(digits, 0, "", ret);
//         return ret;
//     }
    
//     public void recursion(String digits, int pos, String pre, List<String> list){
//         if(pre.length() == digits.length()){
//             list.add(pre);
//             return;
//         }
//         int index = digits.charAt(pos)-'0';
//         for(int i=0; i<chars[index].length; i++){
//             recursion(digits, pos+1, pre + chars[index][i], list);
//         }
//     }
    

}