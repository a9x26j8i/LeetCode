class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        char[] chars = word.toCharArray();
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(backtracking(board, i, j, chars, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    
    boolean backtracking(char[][] board, int x, int y, char[] chars, int curPos){
        //ending condition: judge the leaf node
        if(curPos == chars.length){
            return true;
        }
        if(x<0||x>=board.length||y<0||y>=board[0].length)
            return false;
        if(chars[curPos] != board[x][y])
            return false;
        board[x][y] ^= 256;
        boolean ret = (backtracking(board, x-1, y, chars, curPos+1)
                       ||backtracking(board, x+1, y, chars, curPos+1)
                       ||backtracking(board, x, y-1, chars, curPos+1)
                       ||backtracking(board, x, y+1, chars, curPos+1));
        board[x][y] ^= 256;
        return ret;
    }
}