public class Solution {
    public double myPow(double x, int n) {
        
        double res=1;
        if(n==0)
            return res;
        if(x==1)
            return x;
        if(x==-1)
            return n%2==0?1:-1;
        boolean pos=n>0?true:false;
        if(n==Integer.MIN_VALUE)
            return 0;
        n=Math.abs(n);
        while(n>0){
            res*=x;
            if(res==0)
                return res;
            if(res==Double.MAX_VALUE){
                if(pos)
                    return res;
                else
                    return 0;
            }
            n--;
        }
        return pos?res:1/res;
        
    }
}
