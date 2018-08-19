class Solution {
    public int divide(int dividend, int divisor) {
        //Use long if implement bit manipulation
        if(divisor==0 || dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        int res = 0;
        int sign = (divisor<0 ^ dividend<0)? -1 : 1;
        long dvd = Math.abs((long)dividend);
        long dvs = Math.abs((long)divisor);
        while(dvd>=dvs){
            long temp = dvs, multiple = 1;//WARNING!! if use int, temp will overflow in: while(temp<<1 <=dvd){}
            while(temp<<1 <= dvd){
                temp <<= 1; multiple <<= 1;
            }
            res += multiple;
            dvd -= temp;
        }
        return sign==-1? -res : res;
    }
}