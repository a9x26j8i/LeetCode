class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length <2){
            return 0;
        }
        
        int profit=0, minSoFar=prices[0];
        System.out.println(prices.length);
        for(int i=1; i<prices.length; i++){
            profit = Math.max(profit, prices[i]-minSoFar);
            minSoFar = Math.min(minSoFar, prices[i]);
        }
        return profit;
    }
}