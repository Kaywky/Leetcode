public class Solution {
    public int findMin(int[] nums) {
        
        // if(nums.length==1)
        //     return nums[0];
        
        // for(int i=0; i<nums.length-1; i++){
        //     if(nums[i]>nums[i+1])
        //         return nums[i+1];
        // }
        
        // return nums[0];
        
        if(nums.length==1)
            return nums[0];
        
        int i=0, j=nums.length-1;
        while(i<j){
            int mid = i+(j-i)/2;
            if(nums[mid]>nums[j])
                i=mid+1;
            else if(nums[mid]<nums[j])
                j=mid;
            else
                j--;
        }
        
        return nums[i];
        
    }
}

//second solution: refer to discussion, using Binary Search and O(logn) < the worst case < O(n)
