class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0, j=0; j<s.length(); j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j))+1, i);
            }
            max = Math.max(max, j-i+1);
            //HashMap Entry-put along with verifying
            map.put(s.charAt(j), j);
            if(j==s.length()-1)
                max = Math.max(max, j-i+1);
        }
        return max;
    }
}
