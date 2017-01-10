public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length<=1)
            return;
        boolean ascend=true;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>=nums[i+1])
                continue;
            else{
                ascend=false;break;
            }
        }
        if(ascend){
            Arrays.sort(nums);
            return;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
                int tmp=nums[nums.length-2];
                nums[nums.length-2]=nums[nums.length-1];
                nums[nums.length-1]=tmp;
                return;  
        }
        else{
            int i=nums.length-3;
            while(i>=0){
                if(nums[i]<nums[i+1]){
                    break;
                }
                i--;
            }
            Arrays.sort(nums, i+1, nums.length);
            int j=i+1;
            while(j<nums.length-1){
                if(nums[j]>nums[i])
                    break;
                j++;
            }
            int tmp=nums[i];
            nums[i]=nums[j];
            nums[j]=tmp;
            Arrays.sort(nums, i+1, nums.length);
            return;
        }
   
    }
}
