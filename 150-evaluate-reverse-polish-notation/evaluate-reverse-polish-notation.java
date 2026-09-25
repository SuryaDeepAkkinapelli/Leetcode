class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                int res = stk.pop() + stk.pop();
                stk.push(res);
            }else if(s.equals("-")){
                int first= stk.pop();
                int last= stk.pop();

                stk.push(last - first);
            }else if(s.equals("*")){

                int res = stk.pop() * stk.pop();
                stk.push(res);
            }else if(s.equals("/")){
                int first= stk.pop();
                int last= stk.pop();
                stk.push(last / first);
            }else{
                stk.push(Integer.parseInt(s));
            }
        }
        return stk.peek();
    }
}