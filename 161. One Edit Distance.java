public class Solution {
    public boolean isOneEditDistance(String s, String t) {
        int lens=s.length();
        int lent=t.length();
        if(lens!=lent && Math.abs(lens-lent)!=1)
            return false;
        if((lens==0 && lent==1)||(lens==1 && lent==0))
            return true;
        if(lens==lent){
            int i=0;
            int diff=0;
            while(i<lens){
                if(s.charAt(i)!=t.charAt(i))
                    diff++;
                if(diff>1)
                    return false;
                i++; 
            }
            if(diff==0)
                return false;
            return true;
        }
        else{
            String ss=lens<lent?s:t;
            String tt=lens<lent?t:s;
            int i=0, j=0;
            int diff=0;
            while(i<Math.min(lens, lent)){
                if(ss.charAt(i)!=tt.charAt(j)){
                    if(diff==1)
                        return false;
                    if(ss.charAt(i)==tt.charAt(j+1)){
                        diff++;
                        i++; j=j+2;
                        continue;
                    }
                    else
                        return false;
                }
                i++;j++;
            }
            return true;
        }
    }
}
