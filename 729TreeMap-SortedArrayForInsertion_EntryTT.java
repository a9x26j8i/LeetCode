class MyCalendar {
    TreeMap<Integer, Integer> setIntervals;
    
    public MyCalendar() {
        setIntervals = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Map.Entry<Integer, Integer> earlyEvent = setIntervals.floorEntry(start);
        Map.Entry<Integer, Integer> lateEvent = setIntervals.ceilingEntry(start);
        if((earlyEvent==null || earlyEvent.getValue()<=start) && (lateEvent==null || end<=lateEvent.getKey())){
            setIntervals.put(start, end);
            return true;
        }
        return false;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */