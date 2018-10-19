class MedianFinder {
    private PriorityQueue<Integer> smallElementsLargest;
    private PriorityQueue<Integer> largeElementsSmallest;
    private int size;
    /** initialize your data structure here. */
    public MedianFinder() {
        smallElementsLargest = new PriorityQueue<Integer>(
                                   (o1, o2)-> Integer.compare(o2, o1));
        largeElementsSmallest = new PriorityQueue<Integer>(
                                   (o1, o2)-> Integer.compare(o1, o2));
        size = 0;
    }
    public void addNum(int num) {
        //size < 2
        if(size<2){
            smallElementsLargest.add(num);
        } 
        //size > 2
        //1. add number
        else{
            if(num <= smallElementsLargest.peek() ){
                smallElementsLargest.add(num);
            }else{
                largeElementsSmallest.add(num);
            } 
        }
           
        //2. adjust size
        if(smallElementsLargest.size() + 1 == largeElementsSmallest.size()){
            smallElementsLargest.add(largeElementsSmallest.poll());
        }else if(smallElementsLargest.size() == largeElementsSmallest.size()+2){
            largeElementsSmallest.add(smallElementsLargest.poll());
        }
        ++size;
    }
    
    public double findMedian() {
        double result = 0;
        if(smallElementsLargest.size() == largeElementsSmallest.size()){
            result = (smallElementsLargest.peek() + largeElementsSmallest.peek())*1.0/2;
            return result;
        }else{
            return smallElementsLargest.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
