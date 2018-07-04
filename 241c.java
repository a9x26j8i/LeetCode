class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = diffWaysToComput(input);
        Collections.sort(result);
        return result;
    }
    public List<Integer> diffWaysToComput(String input) {
        List<Integer> ret = new ArrayList<Integer>();    
        if(isNumber(input)){
            ret.add(Integer.valueOf(input));
            return ret;
        }
        //prerequisite
        for(int i=0; i<input.length(); i++){
            if(!Character.isDigit(input.charAt(i)))
            {
                //1.Divide
                String left = input.substring(0, i);
                String right = input.substring(i+1, input.length());
                List<Integer> lr = diffWaysToComput(left);
                List<Integer> rr = diffWaysToComput(right);
                //2.Conquer
                for(Integer l:lr){
                    for(Integer r:rr){
                        switch(input.charAt(i)){
                            case '+': ret.add(l+r);break;
                            case '-': ret.add(l-r);break;
                            case '*': ret.add(l*r);break;
                        }
                    }
                }
                
             }
            
        }
        // a concise substitution for isNumber(String str)
        // if(ret.size()==0){
        //     ret.add(Integer.valueOf(input));
        // }
        return ret;
    }
    private boolean isNumber(String str){
        for(int i=0; i<str.length(); i++){
            if(!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}