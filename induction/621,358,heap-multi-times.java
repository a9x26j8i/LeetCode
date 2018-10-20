class Solution {
    public int leastInterval(char[] tasks, int n) {
        int CHAR_SIZE = 26;
        int[] freq = new int[CHAR_SIZE];
        int offset = 'A';
        for(char c : tasks){
            freq[c-offset]++;
        }
        PriorityQueue<Integer> charFreqMax = new PriorityQueue<Integer>(
           (o1, o2) -> freq[o1] != freq[o2]?
            Integer.compare( freq[o2],freq[o1]) : Integer.compare(o1, o2));
        //1. save a max_heap
        for(int i=0; i<CHAR_SIZE; i++){
            if(freq[i] != 0){
                charFreqMax.add(i);    
            }
        }
        
        int curLen = 0;
        //2.iter heap, each time extract n times
        while(!charFreqMax.isEmpty()){
            List<Integer> polledIndex = new LinkedList<>();
            for(int i=0; i<n+1; i++){
                if(!charFreqMax.isEmpty()){
                    int curInteger = charFreqMax.poll();
                    freq[curInteger] -- ;
                    if(freq[curInteger] != 0){
                        polledIndex.add(curInteger);
                    }
                    char curChar = (char)( curInteger + offset);
                    curLen ++;
                }else if(polledIndex.isEmpty()){
                    return curLen;
                }else{
                    curLen++;
                }
            }
            //add polledIndex back into heap
            for(Integer i : polledIndex){
                charFreqMax.add(i);
            }
        }
        return curLen;
    }
}
