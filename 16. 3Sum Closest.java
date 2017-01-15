public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int res=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int sum=target-nums[i];
            int left=i+1, right=nums.length-1;
            while(left<right){
                if(nums[left]+nums[right]==sum)
                    return target;
                res=Math.abs(sum-nums[left]-nums[right])<Math.abs(res)?sum-nums[left]-nums[right]:res;
                if(nums[left]+nums[right]<sum)
                    left++;
                else
                    right--;
            }
        }
        
        return target-res;
        
    }
}
