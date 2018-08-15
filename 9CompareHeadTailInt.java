class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || x>0 && x%10==0) return false;
        if(x==0) return true;
        int rev = 0;
        int num = x;
        while(rev<x){  
            rev = rev*10 + x%10;
            x /= 10;
        }
        return rev==x || rev/10==x;
    }
}