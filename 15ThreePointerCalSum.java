class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i==0 || nums[i]!=nums[i-1]){//unique element
                int p1=i+1, p2=nums.length-1;
                while(p1<p2){
                    if(nums[p1]+nums[p2]==-nums[i]){
                        ret.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                        p1++;p2--;
                        while(p1<p2&&nums[p1]==nums[p1-1]){
                            p1++;
                        }
                        while(p1<p2&&nums[p2]==nums[p2+1]){
                            p2--;
                        }
                        if(p2<=p1) break;
                    }else if(nums[p1]+nums[p2]<-nums[i]){
                        p1++;
                    }else{
                        p2--;
                    }
                    
                }
            }
        }
        return ret;
    }
}