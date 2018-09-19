class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Integer i1, i2;
        for(String token : tokens){
            if('0' <= token.charAt(token.length()-1) && token.charAt(token.length()-1) <= '9'){
                System.out.println("push nums:"+token);
                stack.push(Integer.valueOf(token));
            }else{
                //watchout the pop order!!
                i2 = stack.pop();
                i1 = stack.pop();
                if(token.equals("+")){
                    stack.push(i1 + i2);
                    System.out.println("top1:"+stack.peek());
                }else if(token.equals("-")){
                    stack.push(i1 - i2);
                    System.out.println("top2:"+stack.peek());
                }else if(token.equals("*")){
                    stack.push(i1 * i2);
                    System.out.println("top3:"+stack.peek());
                }else{
                    stack.push(i1/i2);
                    System.out.println("top4:"+stack.peek());
                }
            }
        }
        return stack.pop();
    }
}