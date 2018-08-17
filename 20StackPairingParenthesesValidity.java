class Solution {
    //for(char c : s.toCharArray()) Iteration
    //implement corresponding relationship while storing 
    public boolean isValid(String s){
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()){//underlying info: C exists.
            if(c=='{')  stack.push('}');
            else if(c=='(')  stack.push(')');
            else if(c=='[')  stack.push(']');
            else if(stack.isEmpty() || c!=stack.pop())  return false; //Correspoing to the underlying info
        }
        return stack.isEmpty();
    }
    

    // public boolean isValid(String s) {
    //     Stack<Character> stack = new Stack(); int p = 0;
    //     while(p<s.length()){//!Iteration may implemented by for(char c : s.toCharArray())
    //         if(s.charAt(p)=='(' || s.charAt(p)=='{' || s.charAt(p)=='['){
    //             stack.push(s.charAt(p));//!May implement CORRESPONDING RELATIONSHIP while STORING
    //         }else{
    //             if(stack.isEmpty()) return false;
    //             if(s.charAt(p)==']' && stack.peek()!='[') return false;
    //             if(s.charAt(p)==')' && stack.peek()!='(') return false;
    //             if(s.charAt(p)=='}' && stack.peek()!='{') return false;
    //             stack.pop();
    //         }
    //         p++;
    //     }
    //     return stack.isEmpty();
    // }
}