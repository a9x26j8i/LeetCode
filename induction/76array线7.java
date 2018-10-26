class Solution {
    public String minWindow(String s, String t) {
        int[] charToFreqMapping = new int[256];
        int[] tarMapping = new int[256];
        int head = 0;
        String result = "";
        int distance = t.length();
        
        //fill targetMapping
        for (int i = 0; i < t.length(); i++) {
            tarMapping[t.charAt(i)]++;
        }
        //go through s
        for (int i = 0; i < s.length(); i++) {
            //track effective chars
            if (tarMapping[s.charAt(i)] == 0) {
                continue; 
            }
            charToFreqMapping[s.charAt(i)]++;
            if (charToFreqMapping[s.charAt(i)] <= tarMapping[s.charAt(i)]) {
                distance--;
            } 
            //update head
            if (distance == 0) {
                while (tarMapping[s.charAt(head)] == 0 || charToFreqMapping[s.charAt(head)] > tarMapping[s.charAt(head)]) {
                    charToFreqMapping[s.charAt(head)]--;
                    head++;
                }
                if (result.equals("") || i - head + 1 < result.length()) {
                    result = s.substring(head, i + 1);
                }
            }
        }
        return result;
    }
}
