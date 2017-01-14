public class Solution {
    
    int res;
    
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1)
            return s.length();
        res=1;
        int[] ch=new int[128];
        for(int i=0; i<s.length()-1; i++){
            ch[(int)s.charAt(i)]=1;
            helper(ch, s, i, i+1);
            ch[(int)s.charAt(i)]=0;
        }
        
        return res;
    }
    
    
    public void helper(int[] ch, String s, int i, int j){
        if(j>=s.length())
            return;
        if((int)ch[s.charAt(j)]>0)
            return;
        else{
            ch[s.charAt(j)]=1;
            res=Math.max(res, j-i+1);
            helper(ch, s, i, j+1);
            ch[s.charAt(j)]=0;
        }
        
        return;
      
    }
    
}
