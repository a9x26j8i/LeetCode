class KthLargest {
    PriorityQueue<Integer> largeElementsSoFar;
    private final int _capacity;
    
    public KthLargest(int k, int[] nums) {
        largeElementsSoFar = new PriorityQueue<>(new Comparator<Integer>(){
            //@override
            public int compare(Integer i1, Integer i2){
                return i1-i2;
            }
        });
        _capacity = k;
        
        for(int val : nums){
            this.add(val);
        }
    }
    
    public int add(int val) {
        if(largeElementsSoFar.size() < _capacity){
            largeElementsSoFar.offer(val);
        }else{
            if(largeElementsSoFar.peek() < val){
                largeElementsSoFar.poll(); //remove()?
                largeElementsSoFar.offer(val);
            }
        }
        return largeElementsSoFar.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */