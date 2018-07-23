  class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if(n==0){
            return matrix;
        }
        int[][] direction = {
            {0,1},{1,0},{0,-1},{-1,0}
        };
        int direction_i=0;//0-3;
        int[] dimension = {n, n-1};int dimension_i=0;//0-1
        int content=1, x=0, y=-1;
        while(dimension[dimension_i]>0){
            System.out.println(dimension[dimension_i]);
            for(int i=0; i<dimension[dimension_i]; i++){ 
                //self-making x&y for valid value in the last step.
                x+=direction[direction_i][0];
                y+=direction[direction_i][1];
                matrix[x][y]=content++;
            }
            
            dimension[dimension_i]--;
            dimension_i = (dimension_i+1)%2;
            direction_i = (direction_i+1)%4;
            System.out.println("direction:"+direction_i);
        }
        return matrix;
    }
}