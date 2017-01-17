
//requirement: order of O(logn)

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] res=new int[2];
        Arrays.fill(res, -1);
        
        if(nums.length==0)
            return res;
        
        if(target<nums[0]||target>nums[nums.length-1])
            return res;
        
        int index=Arrays.binarySearch(nums, target);
        if(index<0)
            return res;
        
        int i=0, j=index;  
        while(i<j){
            if(nums[j-1]!=nums[j])
                break;
            j=Arrays.binarySearch(nums,i, j,target);
        }
        
        int left=j;
        
        i=index;
        j=nums.length-1;
        
        while(i<j){
            if(nums[i]!=nums[i+1])
                break;
            i=Arrays.binarySearch(nums,i+1,j+1,target);
        }
        
        int right=i;
        
        res[0]=left;
        res[1]=right;
        
        return res;

    }
}
