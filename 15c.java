class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null||nums.length<=2){
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int n:nums){
            System.out.println(n);
        }
        int index=0;
        int last = nums[0]+1;
        //for at least 3 elements nums
        while(index<nums.length-2&&nums[index]<=0){
            System.out.println("examinePrime:"+nums[index]);
            //careful about ArrayOutOfBound Error of arrays 
            if(index<nums.length) last = nums[index];
            List<List<Integer>> result = findTwo(nums, nums[index], index+1, nums.length-1, -nums[index]);
            if(result.size()!=0){
                System.out.println("Prime:"+nums[index]);
                list.addAll(result);//addAll()
                last = nums[index];
            }
            do{
               index++; 
            }while(index<nums.length&&nums[index]==last);//judge the validity of indices first!!
        }
        return list;
    }
    private List<List<Integer>> findTwo(int[] nums,int first, int start, int end, int target){
        List<List<Integer>> list = new ArrayList<>();
        int last_start=nums[start]+1, last_end=nums[end]+1;
        while(start<end){
            if(nums[start]+nums[end]<target){
                start++;
            }else if(nums[start]+nums[end]>target){
                end--;
            }else{
                List<Integer> group = new ArrayList<Integer>();
                group.add(new Integer(first));
                group.add(new Integer(nums[start]));
                group.add(new Integer(nums[end]));
                System.out.println("first:"+first+"second:"+nums[start]+"third:"+nums[end]);
                last_start = nums[start];
                last_end = nums[end];
                list.add(group);
                do{
                    start++; end--;
                }while(start<nums.length&&end>=0&&(nums[start]==last_start&&nums[end]==last_end));
                //be careful about while()(continuing contidion)
            }
        }
        return list;
    }
}