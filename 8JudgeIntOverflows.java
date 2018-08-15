class Solution {
    public int myAtoi(String str) {
        //trim all whitespaces
        str = str.trim();
        //initial values
        int index = 0, sign = 1, ret = 0, digit = 0;
        //all whitespaces case
        if(str.length()==0) return 0;
        //handle signs
        if(str.charAt(index)=='+' || str.charAt(index)=='-')
            sign = str.charAt(index++) == '+'? +1 : -1 ;
        //convert char to int & JUDGE IF RET OVERFLOWS
        while(index<str.length()){
            digit = str.charAt(index++)-'0' ;
            if(digit<0 || digit>9) break;
            if(Integer.MAX_VALUE/10 < ret || Integer.MAX_VALUE/10==ret && digit>Integer.MAX_VALUE%10){
                return sign==1? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }else{
                ret = ret*10 + digit;
            }   
        }
        return ret*sign;
    }
}