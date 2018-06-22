public List<String> generateParenthesis(int n) {
    //List is an interface, ArrayList is a class.
    List<String> list = new ArrayList<String>(); 
    backtrack(list, "", 0, 0, n);
    return list;
    }
    
    public void backtrack(List<String> list, String str, int open, int close, int max){
        //if str is a leaf node, store it&return to backtrack
        if(str.length() == max*2){
            list.add(str);
            return;
        }
        //judege&traverse possible children, 'str+"(""' is the form for backtracking!
            //try most "(" first, then discard it and try ")".
        if(open < max)
            backtrack(list, str+"(", open+1, close, max);
        if(close < open)
            backtrack(list, str+")", open, close+1, max);
    }