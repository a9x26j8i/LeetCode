public class Solution {
	public static void main(String[] args) {
   	String str = "aabbcc";
   	int k = 3;
   	System.out.println("start");
   	String ret = rearrangeString(str, k);
   	System.out.println(ret);
   	
   }
	public static String rearrangeString(String str, int k) {
		final int size = 26;
      int[] frequency = new int[size];
      final int offset = 'a';
      boolean firstTime = false;
      StringBuilder ret = new StringBuilder();
      //1. save chars
      for(int i=0; i<str.length(); i++) {
      	frequency[str.charAt(i)-offset]++;
      }
      PriorityQueue<Integer> charFrequencyMax = new PriorityQueue<>
      ((o1, o2) -> 
      				frequency[o2] != frequency[o1]? 
      				Integer.compare(frequency[o2],frequency[o1])
      			  :Integer.compare(o2, o1));
      
      //2. add chars into heap
      for(int i=0; i<size; i++) {
      	if(frequency[i] > 0) {
      		charFrequencyMax.add(i);
      	}
      }
      
      //poll char with largest size from the heap *k
      while(!charFrequencyMax.isEmpty()) {
      	List<Integer> polledIndex = new ArrayList<>();
      	int pollSize = Math.min(k, charFrequencyMax.size());
      	//poll each biggest
      	for(int i=0; i<pollSize; i++) {
      		int curIndex = charFrequencyMax.poll();
      		ret.append((char)(curIndex + offset));
      		frequency[curIndex]--;
      		if(frequency[curIndex] != 0) {
      			polledIndex.add(curIndex);
      		}
      	}
      	//if the second time k < availableChars
      	if(pollSize < k && !polledIndex.isEmpty()) {
      		return "no qualified string";
      	}
      	firstTime = charFrequencyMax.size() < k;
      	//add back polledIndex
      	for(int i : polledIndex) {
      		charFrequencyMax.add(i);
      	}
      }
      //size--, put back to the heap
		return ret.toString();
   }
}
