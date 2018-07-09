public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        //Object can be null or length==0
        if(matrix == null||matrix.length==0||matrix[0].length==0){
            return new int[]{};
        }
        int height = matrix.length;
        int width = matrix[0].length;
        int[] ret = new int[height*width];
        int[][] dir={{-1,1},{1,-1}};
        int row=0,col=0,dirindex=0;
        for(int i=0; i<height*width; i++){
            ret[i] = matrix[row][col];
            //succinct/less code for less possibility of mistakes
            row += row+dir[dirindex][0];//row+=dir[dirindex][0];
            col += dir[dirindex][1];//col+=dir[dirindex][1];
            if(row>=height){row=height-1; col+=2; dirindex=1-dirindex;}
            if(col>=width){col=width-1; row+=2;dirindex=1-dirindex;}
            if(row<0){row=0; dirindex=1-dirindex;}
            if(col<0){col=0; dirindex=1-dirindex;}
        }
        return ret;
    }
}