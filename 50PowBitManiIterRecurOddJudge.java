class Solution {
   // ITERATION VERSION(faster)
    public double myPow(double x, int n){
        double res = 1;
        if(n==0) return 1;
        if(n==Integer.MIN_VALUE){
            x = 1/x;
            res = x;
            n = Integer.MAX_VALUE;
        }else if(n<0){
            n = -n;
            x = 1/x;
        }
        while(n>0){
            if((n & 1) == 1){
                res *= x;
                n--;
            }else{
                x = x*x;
                n >>= 1;
            }
        }
        return res;
    }
    // RECURSION(slower)
    // public double myPow(double x, int n){
    //     if(n==0) return 1;
    //     if(n==Integer.MIN_VALUE){
    //         x = 1/x;
    //         return x*myPow(x, Integer.MAX_VALUE);
    //     }
    //     if(n<0){
    //         x = 1/x;
    //         n = -n;
    //     }
    //     return ((n&1) == 1)? x*myPow(x, n-1) : myPow(x*x, n/2);
    // }
    
}
