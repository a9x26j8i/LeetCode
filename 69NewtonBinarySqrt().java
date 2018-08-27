class Solution {
	//BINARY SERACH VERSION
	public int mySqrt(int x){
        if(x==0) return 0;
        int left = 1, right = x;
        int middle;
        while(true){
            middle =left+ (right-left)/2;   //溢出！！！
            if(middle > x/middle) right = middle-1;//溢出！！！
            else{
                if((middle+1)>x/(middle+1)) return middle;
                else left = middle+1;
            }
        }
    }    


	//NEWTON VERSIONepsilon(error) version.
    // public int mySqrt(int x) {
    //     if(x==0) return 0;
    //     double last, res = x;
    //     double err = 1;
    //     while(true){
    //         last = res;
    //         res = (double) (res + x/res)*0.5;
    //         if(Math.abs(last-res)<err) break;
    //     }
    //     return (int)res;

    //OPTIMIZED NEWTON VERSION
    // public int mySqrt(int x){
    //   	long r = x;
    //  	while (r*r > x)
    //   	r = (r + x/r) / 2;
  		// return (int)r;
    // }
		
}
    