class Solution {
    // public int lengthOfLastWord(String s) {
    //     String[] strs = s.split(" ");
    //     if(strs.length==0) return 0;
    //     else return strs[strs.length-1].length();
    // }-
    public int lengthOfLastWord(String s) {
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
}