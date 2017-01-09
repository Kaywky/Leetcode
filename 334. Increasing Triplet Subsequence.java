public class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3)
            return false;
            
        boolean res=false;
        for(int i=0; i<nums.length; i++){
            res = res | helper(nums, 1, i+1, nums[i]);
            if(res)
                return true;
        }
        return res;
    } 
    
    public boolean helper(int[] nums, int len, int index, int number){
        if(len>=3)
            return true;
        if(index==nums.length)
            return false;
        boolean res=false;
        for(int i=index; i<nums.length; i++){
            if(nums[i]>number)
                res = res | helper(nums, len+1, i+1, nums[i]);
            if(res)
                return true;
        }
        
        return res;
        
    }
}
