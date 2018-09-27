class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;
        //dp itself is divisive(for left and above element)
        //notations in dp is different with that in row[], the left most element in dp is always the newest data(for left),
        //dp will traverse each row
        int[] dp = new int[width];//initial condition: obstacleGrid[-1][i] == 0;
        dp[0] = 1;
        for(int[] row: obstacleGrid){
            for(int i=0; i<width; i++){
                if(row[i]==1) dp[i]=0;
                else if(i>0){
                    dp[i] += dp[i-1];
                }
            }
        }
        return dp[width-1];
    }
}
