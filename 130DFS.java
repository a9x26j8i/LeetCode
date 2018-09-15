class Solution {
    public void solve(char[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0)
            return;
        int xmax = board.length, ymax=board[0].length;
        
        for(int i=0; i<xmax; i++){
            if(board[i][0] == 'O')
                DFS(board, i, 0, xmax, ymax);
            if(board[i][ymax-1] == 'O')
                DFS(board, i, ymax-1, xmax, ymax);
        }
        for(int i=0; i<ymax; i++){
            if(board[0][i] == 'O')
                  DFS(board, 0, i, xmax, ymax);
            if(board[xmax-1][i] == 'O')
                DFS(board, xmax-1, i, xmax, ymax);
        }
        
        for(int i=0; i<xmax; i++){
            for(int j=0; j<ymax; j++){
                if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }else if(board[i][j]=='*'){
                    board[i][j] = 'O';
                }
            }
        }
    }
    private void DFS(char[][] board, int x, int y, int xmax, int ymax){
        
        if(x<0 || y<0 || x>=xmax || y>=ymax){
            return;
        }
        
        if(board[x][y] == 'O'){
            board[x][y] = '*';
            
        }
        
        if(x-1 >= 0 && board[x-1][y] == 'O'){
            DFS(board, x-1, y, xmax, ymax);
        }
        if(x+1 <= xmax-1 && board[x+1][y] == 'O'){
            DFS(board, x+1, y, xmax, ymax);
        }
        if(y+1 <= ymax-1 && board[x][y+1] == 'O'){
            DFS(board, x, y+1, xmax, ymax);
        }
        if(y-1 >=0 && board[x][y-1] == 'O'){
            DFS(board, x, y-1, xmax, ymax);
        }
    }
}