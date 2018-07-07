class Solution {
    public String convert(String s, int numRows) {
        if(s==null||s.length()==0){
            return "";
        }
        if(s.length()==1){
            return s;
        }
        StringBuilder ret = new StringBuilder();
        char[] chars = s.toCharArray(); int length = s.length();
        int pos = 0;
        int step1=0, step2=0;
        ret.append(chars[0]);
        for(int i=1; i<=numRows; i++){
            pos=i;
            step1=2*numRows-i*2;
            step2=(i-1)*2;
            if(step1==0&&step2==0) step1=1;
            while(true){
                if(pos>length) break;
                else{
                    if(step2!=0)
                        ret.append(chars[pos-1]);
                    pos+=step1;
                } 
                if(pos>length) break;
                else{
                    if(step1!=0)
                        ret.append(chars[pos-1]);
                    pos+=step2;
                }
            }   
        }
        return ret.toString();
    }
}