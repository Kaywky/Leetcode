public class Solution {
    public int mySqrt(int x) {
        
        if(x<1)
            return 0;
        if(x==1)
            return 1;
        
        long i=1, j=(long)x;
        long mid=0;
        while(i<=j){
            mid=i+((j-i)>>1);
            if(mid*mid==(long)x)
                return (int)mid;
            if(mid*mid<(long)x && (mid+1)*(mid+1)>(long)x)
                return (int)mid;                
            
            if(mid*mid>(long)x)
                j=mid-1;
            else
                i=mid+1;
        }
        
        return (int)mid;
        
    }
}
