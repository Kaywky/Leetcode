public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int[] sum=new int[nums.length+1];
        sum[0]=0;
        for(int i=1; i<nums.length+1; i++){
            sum[i]=sum[i-1]+nums[i-1];
        }
        int j=sum.length-1;
        int min=nums.length+1;
        while(sum[j]>=s){
            for(int k=j-1; k>=0; k--){
                if(sum[j]-s>=sum[k]){
                    min=Math.min(min,j-k);
                    break;
                }
            }
            j--;
        }
        return min>nums.length?0:min;
    }
}
//slow
