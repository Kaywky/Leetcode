public class Solution {
    
    public int numDecodings(String s) {
        if(s.length()==0)
            return 0;
        if(s.charAt(0)=='0')
            return 0;
        int[] dp=new int[s.length()+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=1; i<s.length(); i++){
            int tmp=Integer.valueOf(s.substring(i-1, i+1));
            if(tmp>26 && s.charAt(i)!='0')
                dp[i+1]=dp[i];
            else if(tmp<=26 && tmp>0 && s.charAt(i)=='0')
                dp[i+1]=dp[i-1];
            else if(tmp<=26 && tmp>0 && tmp>0){
                dp[i+1]=s.charAt(i-1)=='0'?dp[i]:dp[i-1]+dp[i];
            }
            else
                return 0;
        }
        
        return dp[s.length()];
        
    }
    
}
