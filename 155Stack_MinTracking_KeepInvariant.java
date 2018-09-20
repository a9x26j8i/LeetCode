
//INVARIANT: min is the smallest in the stack
class MinStack {
    Stack<Integer> stack;
    int min;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        stack.push(x);
        //judge min
        if(x < min){
            min = x;
        }
        stack.push(min);
    }
    
    public void pop() {
        stack.pop();
        stack.pop();
        if(!stack.isEmpty()){
            min = stack.peek();
        }else{
            min = Integer.MAX_VALUE;
        }    
    }
    
    public int top() {
        Integer temp = stack.pop();
        Integer ret = stack.peek();
        stack.push(temp);
        return ret;
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */