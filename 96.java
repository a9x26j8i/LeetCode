class Solution {
    public int numTrees(int n) {
         int[] res = new int[n+3];
         res[0] = 1;
         res[1] = 1;
         res[2] = 2;
         if(n==0||n==1||n==2){
             return res[n];
         }
         for(int i=3; i<=n; i++){
            for(int j=0; j<i; j++){
                res[i] += res[j] * res[i-1-j]; 
            }
         }
        return res[n];
    }
}