class Solution {
    public int numIslands(char[][] grid) {
        int counter =0;
        for(int i=0; i < grid.length; i++){
            for(int j=0; j < grid[0].length; j++){
                //count
                if(grid[i][j] == '1'){
                    ++counter;
                    exam(grid, i, j);
                }    
            }
        }
        return counter;
    }
    
    private void exam(char[][] grid, int x, int y){
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != '1'){
            return;
        }
        grid[x][y] = '*' ;
        
        exam(grid, x-1, y);
        exam(grid, x+1, y);
        exam(grid, x, y+1);
        exam(grid, x, y-1);
    }
    
//     private void exam(char[][] grid, int x, int y){
//         grid[x][y] = '*' ;
//         //exam up, down, left, right
//         if(x-1 >= 0 && grid[x-1][y] == '1'){
//             exam(grid, x-1, y);
//         }
//         if(x+1 < grid.length && grid[x+1][y] == '1'){
//             exam(grid, x+1, y);
//         }
//         if(y-1 >= 0 && grid[x][y-1] == '1'){
//             exam(grid, x, y-1);
//         }
//         if(y+1 < grid[0].length && grid[x][y+1] == '1'){
//             exam(grid, x, y+1);
//         }
        
//         return;
//     }
}