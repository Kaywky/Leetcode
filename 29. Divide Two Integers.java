
public class Solution {
    public int divide(int dividend, int divisor) {
        
        int sign=1;
        if((dividend<0 && divisor>0) || (dividend>0 && divisor<0))
            sign=-1;
        
        if(divisor==0)
            return Integer.MAX_VALUE;
        
        if(dividend==Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;
            
        if(divisor==1)
            return dividend;
        if(divisor==-1)
            return -dividend;
            
        if(dividend==divisor)
            return 1;
        if(dividend==-divisor)
            return -1;
                
        long ldividend=Math.abs((long)dividend);
        long ldivisor=Math.abs((long)divisor);
        
        long ans=helper(ldividend, ldivisor);
        if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else 
            return sign==1?(int)ans:(int)(-ans);

    }
    
    
    private long helper(long dividend, long divisor){
        if(dividend<divisor)
            return 0;
        
        long tmp=divisor;
        long res=1;
        while(dividend>=(tmp+tmp)){
            tmp=(tmp<<1);
            res=(res<<1);
        }
        
        
        return helper(dividend-tmp, divisor)+res;
        
    }
    
}

//refer to discussion forum;
