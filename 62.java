class Solution {
    public int uniquePaths(int m, int n) {
        int N = m+n-2;
        double ret =1;
        for(int i=0; i<=n-2; i++){
            //Use doulbe for divisions and fractions
            ret *= (double)(N-i)/(i+1) ;
            System.out.println((N-i)+"/"+(i+1)+"="+ret);
        }
        //+0.5 for correct rounding
        return (int)(ret+0.5);
    }
}