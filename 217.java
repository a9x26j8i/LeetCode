class Solution {
    public boolean containsDuplicate(int[] nums) {
        //use HashSet, don's use int[], it will waste lots of memory;
        final Set<Integer> set1 = new HashSet<Integer>();
        for(int i:nums){
            if(set1.contains(i))
                return true;
            set1.add(i);
        }
        return false;
    }
}


