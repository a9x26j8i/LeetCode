class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length, sum=0;
        for(int i=0; i<length-1; i++){
            if(prices[i+1]>prices[i])
                sum += prices[i+1]-prices[i];
        }
        return sum;
    }
}