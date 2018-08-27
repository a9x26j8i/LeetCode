class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length==0) return null;
        //processing HashMap
        Map<String, List<String>> map = new HashMap<>();
        
        for(String str: strs){
            //Break the Strings
            char[] charArray = str.toCharArray();
            //Reorganize
            Arrays.sort(charArray);
            //Gether together into an Object
            String temp = String.valueOf(charArray);
            if(map.containsKey(temp)){
                map.get(temp).add(str);
            }else{
                map.put(temp, new LinkedList<String>());
                map.get(temp).add(str);
            }
            
        }
        //！！！：<E> E should be the same as values's //List<String>
        return new LinkedList<List<String>>(map.values());
    }
}
