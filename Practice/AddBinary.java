class Solution {
    public String addBinary(String a, String b) {
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        int n = Math.max(aa.length, bb.length);
        int[] result = new int[n+1];
        int temp=0;int x,y;
        StringBuilder sb = new StringBuilder();
        for(int i=aa.length-1, j=bb.length-1; i>=0||j>=0; i--,j--){
            if(i<0){x=0;}else{x=aa[i]-'0';}
            if(j<0){y=0;}else{y=bb[j]-'0';}
            temp = temp+x+y;
            sb.insert(0, temp%2);
            if(temp>=2) temp=1; else temp=0;
        }
        if(temp==1){
            sb.insert(0, 1);
        }
        return sb.toString();
    }
}