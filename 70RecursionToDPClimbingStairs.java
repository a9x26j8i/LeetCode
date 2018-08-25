class Solution {
	//DP
	int climbStairs(int n) {
		if (n <= 2) return n;
		int[] dp = new int[n+1];
		dp[1] = 1; dp[2] = 2;
		for (int i = 3; i <= n; i++)
			dp[i] = dp[i - 1] + dp[i - 2];
		return dp[n];
	}
	//TimeLimitExceed
    public int climbStairs(int n) {
        //the recursion base much be complete !! 
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else if(n==2)
            return 2;
        else
            return climbStairs(n-1)+climbStairs(n-2);
    }
    
	//Succinct version, TLE
	// public int climbStairs(int n) {
	// 		if (n <= 2) return n;
	// 		return climbStairs3(n - 1) + climbStairs3(n - 2);
	// 	}
}
