class Solution {
    //DP: from recursion to DP
    public int numDecodings(String s){
        int[] dp = new int[s.length()+1];
        dp[0] = 1;//dp[2] maybe equals dp[1]+dp[0];
        dp[1] = s.charAt(0) == '0'? 0:1;//starting validation
        
        for(int i=2; i<=s.length(); i++){
            int one = Integer.valueOf(s.charAt(i-1)+"");
            int two = Integer.valueOf(s.substring(i-2, i));
            
            if(one != 0){
                dp[i] += dp[i-1];
            }
            if( 10<=two && two <= 26){
                dp[i] += dp[i-2];
            }
        }
        return dp[s.length()];
    }
    
//     //backtracking: TimeLimitExceeds
//     int count=0;
//     public int numDecodings(String s) {
//         backtracking(s);
//         return count;
        
//     }
//     public void backtracking(String s){
//         //terminal
//         if(s.length()>0 && s.charAt(0)=='0'){
//             return;
//         }
//         if(s.length()==0 || s.length()==1){
//             count++;
//             return;
//         }
//         //branching
//         if(s.charAt(0)=='1' || (s.charAt(0)=='2'&&Integer.valueOf(s.charAt(1)+"")<=6)){//s.charAt(1)+"" OR s.substring(0,1)
//             backtracking(s.substring(1, s.length()));
//             backtracking(s.substring(2, s.length()));
//         }else{
//             backtracking(s.substring(1, s.length()));
//         }
//     }
}