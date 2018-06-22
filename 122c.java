class Solution {
    public int maxProfit(int[] prices) {
      int i=0,j=1, sum=0;
        if(prices.length<2){
            return 0;
        }
        
        while(j<prices.length){
            if(prices[j]>prices[j-1]){
                j++;
                if(j==prices.length){
                    sum+=prices[j-1]-prices[i];
                }
            }else{
                sum += prices[j -1]-prices[i];
                i = j;
                j++;
            }
        }
        
       return sum;  
    }
}