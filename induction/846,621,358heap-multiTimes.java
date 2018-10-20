
class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
        int len = hand.length;
        //情况被包含
        // if(len % W != 0){
        //     System.out.println("stupid");
        //     return false;
        // }
        //save into hashMap
        HashMap<Integer, Integer> valToFreq = new HashMap<>();
        for(int i=0; i<len; i++){
            valToFreq.put(hand[i], valToFreq.getOrDefault(hand[i], 0)+1);//map.put(hand[i], map.getOrDefault(key, 0)+1);
        }
        //save into heap
        PriorityQueue<Map.Entry<Integer, Integer>> minValues = new PriorityQueue<>(
            (o1, o2) -> Integer.compare(o1.getKey(), o2.getKey()));
        minValues.addAll(valToFreq.entrySet());
        //iter W smallest values 
        int last = 0;
        while(!minValues.isEmpty()){
            List<Map.Entry<Integer, Integer>> toBeAdded = new LinkedList<>();
            for(int i=0; i<W; i++){
                Map.Entry<Integer, Integer> curSmallest = minValues.poll();//Entry要有类型！！！
                if(curSmallest == null){
                    return false;
                }else{
                    curSmallest.setValue(curSmallest.getValue() - 1);
                }
                if(curSmallest.getValue() != 0){
                    toBeAdded.add(curSmallest);
                }
                //evaluate and update last
                if(i!=0 && curSmallest.getKey() != last+1){
                    return false;
                }
                last = curSmallest.getKey();
            }
            //add back into heap
            minValues.addAll(toBeAdded); 
        }
        return true;
    }
    
}
