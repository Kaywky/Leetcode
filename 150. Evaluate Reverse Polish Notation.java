public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String s: tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int second = Integer.parseInt(stack.pop());
                int first = Integer.parseInt(stack.pop());
                int res = 0;
                switch(s){
                    case "+": res = first+second; break;
                    case "-": res = first-second; break;
                    case "*": res = first*second; break;
                    case "/": res = first/second; break;
                }
                stack.push(Integer.toString(res));
            }
            else{
                stack.push(s);
            }
        }
        
        return Integer.parseInt(stack.pop());
    }
}
