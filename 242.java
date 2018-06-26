class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] count = new int[26];
        //merging two iterations into one by ++ and -- instead of two ++
        for(int i=0; i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        //using iterator is more convenient
        for(int i:count){
            if(i!=0)
                return false;
        }
        return true;
    }
}