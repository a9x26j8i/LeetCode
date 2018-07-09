class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return new ArrayList<Integer>();
        }
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};//for direction of >, v, <, ^
        int dir_index=0;//range from 0 to 3
        int top=-1, bot=matrix.length, left=-1, right=matrix[0].length;
        int x=0, y=0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<matrix.length*matrix[0].length; i++){
            list.add(matrix[x][y]);
            x += dir[dir_index][0]; y += dir[dir_index][1];
            //after finishing 1 direction, update the finished boarder
            if(y>=right){y--; x++; top++; dir_index=1;}
            if(x>=bot){x--; y--; right--; dir_index=2;}
            if(y<=left){x--; y++; bot--; dir_index=3;}
            if(x<=top){x++; y++; left++; dir_index=0;}
        }
        return list;
    }
}