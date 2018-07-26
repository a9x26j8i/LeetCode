class Solution {
//     public int minPathSum(int[][] grid) {
//         int m = grid.length;
//         int n = grid[0].length;
//         int[] dp =  new int[n];
//         for(int i=0; i<n; i++){
//             dp[i] = Integer.MAX_VALUE;
//         }
//         dp[0] = grid[0][0];
//         for(int i=0; i<n; i++){
            
//         }
//     }
    public int minPathSum(int[][] grid) {
	int m = grid.length;// row
	int n = grid[0].length; // column
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			if (i == 0 && j != 0) {
				grid[i][j] = grid[i][j] + grid[i][j - 1];
			} else if (i != 0 && j == 0) {
				grid[i][j] = grid[i][j] + grid[i - 1][j];
			} else if (i == 0 && j == 0) {
				grid[i][j] = grid[i][j];
			} else {
				grid[i][j] = Math.min(grid[i][j - 1], grid[i - 1][j])
						+ grid[i][j];
			}
		}
	}

	return grid[m - 1][n - 1];
}
}