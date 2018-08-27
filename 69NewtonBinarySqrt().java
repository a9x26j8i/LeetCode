class Solution {
	//epsilon(err) version.
    public int mySqrt(int x) {
        if(x==0) return 0;
        double last, res = x;
        double err = 1;
        while(true){
            last = res;
            res = (double) (res + x/res)*0.5;
            if(Math.abs(last-res)<err) break;
        }
        return (int)res;
        
//         long r = x;
//     while (r*r > x)
//         r = (r + x/r) / 2;
//     return (int) r;
    }
    
}