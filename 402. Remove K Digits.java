public class Solution {
    public String removeKdigits(String num, int k) {
        
        if(num.length()==k)
            return "0";
        Stack<Character>stack = new Stack<>();
        

        for(int i=0; i<num.length(); i++){
            char tmp=num.charAt(i);
            while(!stack.isEmpty() && stack.peek()>tmp && k>0){
                stack.pop();
                k--;
            }
            stack.push(tmp);
        }
        
        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        
        StringBuffer res = new StringBuffer();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        
        res.reverse();
        
        while(res.length()>0 && res.charAt(0)=='0')
            res.delete(0,1);
        
        return res.length()==0?"0":res.toString();
        
    }
}

//refer to discussion;
