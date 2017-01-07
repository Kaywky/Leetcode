public class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        int[] sum = new int[nums.length+1];
        sum[0]=0;
        for(int i=1; i<sum.length; i++){
            sum[i]=nums[i-1]+sum[i-1];
        }
        int res=0;
        int i=0, j=sum.length-1;
        while(j>0){
            if((j-i)<res){
                j--; i=0;
                continue;
            }
            if(sum[j]-sum[i]==k){
                res=Math.max(res, j-i);
                j--; i=0;
            }
            else
                i++;
        }
        
        return res;
    }
}
//slow
