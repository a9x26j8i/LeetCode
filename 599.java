class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
    //create HashMap to store String+Integer with O(1) speed.
    Map<String, Integer> map = new HashMap<>();
    List<String> res = new LinkedList<>();
    int minSum = Integer.MAX_VALUE;
    //store list1 in the map
    for (int i=0;i<list1.length;i++) map.put(list1[i], i);
    //find same strings
    for (int i=0;i<list2.length;i++) {
        Integer j = map.get(list2[i]);
        if (j != null && i + j <= minSum) {
            if (i + j < minSum) { res.clear(); minSum = i+j; }
            res.add(list2[i]);
        }
    }
    return res.toArray(new String[res.size()]);
    }
}
