public class Solution {
    public boolean isPerfectSquare(int num) {

        long newnum=num;
        int i=1, j=num;
        while(i<=j){
            long mid=(i+j)/2;
            if(mid*mid==newnum)
                return true;
            if(mid*mid>newnum)
                j=(int)mid-1;
            else
                i=(int)mid+1;
        }
        
        return false;
    }
}
