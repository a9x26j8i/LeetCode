//Syntax: str.indexOf('a'); str.indexOf("abc");

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        String pre = strs[0];
        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(pre)!=0){//if the substring is not the prefix(or not exist at all), subtract it and try again.
                pre = pre.substring(0, pre.length()-1);
            }
        }
        return pre;
    }
}