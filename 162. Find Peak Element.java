public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length<=1)
            return 0;
        int i=0, j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(mid==0){
                if(nums[mid]>nums[mid+1])
                    return mid;
                else{
                    i=mid+1;
                    continue;
                }
            }
            if(mid==nums.length-1){
                if(nums[mid]>nums[mid-1])
                    return mid;
                else{
                    j=mid-1;
                    continue;
                }
            }
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
                return mid;
            else if(nums[mid]<nums[mid-1])
                j=mid-1;
            else
                i=mid+1;
        }
        
        return 0;
        
    }
}
