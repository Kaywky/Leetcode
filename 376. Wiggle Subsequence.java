public class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<=1)
            return nums.length;
        
        int res=1;
        int last=nums[0];
        int lastdiff=0;
        int nowdiff=0;
        for(int i=1; i<nums.length; i++){
            nowdiff=nums[i]-last;
            if(nowdiff==0)
                continue;
            if(lastdiff*nowdiff<=0){
                res++;
                lastdiff=nowdiff;
                last=nums[i];
            }
            else{
                if(lastdiff>0)
                    last=Math.max(nums[i], last); // attention: to get the longest subsequence, we need to do this;
                else
                    last=Math.min(nums[i], last);
            }
        }
        
        return res;
    }
}
