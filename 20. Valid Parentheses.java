public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char tmp=s.charAt(i);
            if(tmp=='(' || tmp=='[' || tmp=='{')
                stack.push(tmp);
            else{
                if(stack.isEmpty())
                    return false;
                char last=stack.pop();
                if(tmp==')'){
                    if(last!='(')
                        return false;
                }
                if(tmp==']'){
                    if(last!='[')
                        return false;
                }
                if(tmp=='}'){
                    if(last!='{')
                        return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
