class Solution {
    public int reverse(int x) {
        int result=0;
        int newresult=0;
        while(x!=0){
            //not record old but a new one;
            newresult = result*10+x%10;
            x=x/10;
            if((newresult)/10!=result)return 0;
            result = newresult;
            
        }
        return result;
    }
}