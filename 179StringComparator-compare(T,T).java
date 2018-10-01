class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0){
            return "";
        }
        
        String[] strs = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }
        
        Comparator<String> com = new Comparator<String>(){
            //@override
            public int compare(String str1, String str2){
                String s1 = str1+str2;
                String s2 = str2+str1;
                
                return s2.compareTo(s1);
            }
        };
        
        Arrays.sort(strs, com);
        
        StringBuilder sb = new StringBuilder();
        
        if(strs[0].equals("0")){
            return "0";
        }
        
        for(int i=0; i<nums.length; i++){
            sb.append(strs[i]);
        }
        return sb.toString();
                                                                            
    }
}