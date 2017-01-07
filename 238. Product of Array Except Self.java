public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2; i>0; i--){
            res[i]=res[i+1]*nums[i];
        }
        for(int i=1; i<nums.length-1; i++){
            nums[i]=nums[i-1]*nums[i];
        }
        int first=res[1];
        int second=nums[nums.length-2];
        for(int i=1; i<nums.length-1; i++){
            res[i]=res[i+1]*nums[i-1];
        }
        res[0]=first;
        res[nums.length-1]=second;
        return res;
    }
}
