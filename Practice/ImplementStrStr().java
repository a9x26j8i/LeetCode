class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0; ;i++){
            for(int j=0; ;j++){
                if(j==needle.length()) return i;//hard, seldomly
                if(i+j==haystack.length()) return -1;//medium, sometimes
                if(haystack.charAt(i+j)!=needle.charAt(j)) break;//easy, frequently
            }
        }
    }
}