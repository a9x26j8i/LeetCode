class Solution {
    //3.78%
    public String minWindow(String s, String t) {
        Map<Character, Integer> charToFreqMapping = new HashMap<>();
        Map<Character, Integer> targetMapping = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String result = "";
        int distance = t.length();
        
        //fill targetMapping
        for (Character c : t.toCharArray()) {
            targetMapping.put(c, targetMapping.getOrDefault(c, 0) + 1);
        }
        //iterate through s
        for (Character c : s.toCharArray()) {
            //add until enough
            sb.append(c);
            charToFreqMapping.put(c, charToFreqMapping.getOrDefault(c, 0) + 1);
            if(targetMapping.get(c) != null && charToFreqMapping.get(c) <= targetMapping.get(c)) {
                distance--;
            } 
            //can remove?
            if (distance > 0 ) {
                continue;
            }
            //remove
            while (targetMapping.get(sb.charAt(0)) == null ||
                charToFreqMapping.get(sb.charAt(0)) > targetMapping.get(sb.charAt(0))) {
                charToFreqMapping.put(sb.charAt(0), charToFreqMapping.get(sb.charAt(0)) - 1);
                sb.delete(0, 1);
            }
            //compare
            if (result == "" || sb.length() < result.length()) {
                result = sb.toString();
            }
            
        }
        return result;
    }
}
