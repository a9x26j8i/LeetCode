class Solution {
    static final int EMPTY = 0;
    //because of cylic attribute,
    //if sum of (gas - cost)>= 0, it will certainly have solution(s)
    //if tank < 0 at i, drag the coordinates to the next point and start from the next point(tank = EMPTY)
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length = gas.length;
        int tank = EMPTY;
        int total = 0;
        int start = 0;
        for(int i=0; i<length ;i++){
            total += gas[i] - cost[i];
            tank += gas[i] - cost[i];
            if(tank < EMPTY){
                tank = EMPTY;
                start = i+1;
            }
        }
        return total<0 ? -1 : start;
    }
}