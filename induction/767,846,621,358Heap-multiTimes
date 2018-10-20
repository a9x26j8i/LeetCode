class Solution {
    public String reorganizeString(String S) {
        final int SIZE = 256;
        int[] indexToFreq = new int[SIZE];
        //map char to freq
        for(int i=0; i<S.length(); i++){
            indexToFreq[S.charAt(i)]++;
        }
        //initial heap
        PriorityQueue<Integer> maxFreqIndices = new PriorityQueue<>(
                (o1, o2)->Integer.compare(indexToFreq[o2], indexToFreq[o1]));
        for(int i=0; i<SIZE; i++){
            if(indexToFreq[i] != 0){
                maxFreqIndices.add(i);
            }
        }
        StringBuilder result = new StringBuilder();
        //iter heap, poll min(2, heap.size()) each time
        while(!maxFreqIndices.isEmpty()){
            List<Integer> toBeAdded = new LinkedList<>();
            int pollSize = Math.min(2, maxFreqIndices.size());
            //poll one by one
            for(int i=0; i<pollSize; i++){
                int index = maxFreqIndices.poll();
                indexToFreq[index] -- ;
                result.append((char)index);
                if(indexToFreq[index] != 0){
                    toBeAdded.add(index);   
                }
            }
            if(pollSize < 2 && !toBeAdded.isEmpty()){
                return "";
            }
            //add back(if any)
            maxFreqIndices.addAll(toBeAdded);
        }
        return result.toString();
    }
}
