public class Solution {
    public boolean canJump(int[] nums) {
        
        int i=0;
        int jump=0;
        while(i<nums.length-1){
            jump--;
            int tmp=nums[i];
            jump=Math.max(jump,tmp);
            if(jump<=0)
                return false;
            else
                i++;
        }
        
        return true;
        
    }
}
