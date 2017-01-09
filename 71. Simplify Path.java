public class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for(int i=0; i<str.length;){
            if(str[i].equals("")){
                i++;
                continue;
            }
            if(str[i].equals(".")){
                if(i+1<str.length && !str[i+1].equals("..") && !str[i+1].equals(".") && !str[i+1].equals("")){
                stack.push(str[i+1]);
                i=i+2;}
                else
                    i++;
                continue;
            }
            if(str[i].equals("..")){
                if(!stack.isEmpty())
                    stack.pop();
                i++;
                continue;
            }
            stack.push(str[i]);
            i++;
        }
        StringBuffer res = new StringBuffer();
        while(!stack.isEmpty()){
            res.insert(0, stack.pop());
            res.insert(0, "/");
        }
        return res.length()==0?"/":res.toString();
    }
}
