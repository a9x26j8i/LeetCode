class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                int row=i, col=j;
                int cube = row/3*3+col/3; //use row/3*3 + col/3, transfer 2d to 1d.
                if(board[row][col]!='.' 
                  && !set.add("row"+row+board[row][col])) return false;
                if(board[row][col]!='.'
                  && !set.add("col"+col+board[row][col])) return false;
                if(board[row][col]!='.'
                  && !set.add("cube"+cube+board[row][col])) return false;
            }
        }
        return true;
    }
}