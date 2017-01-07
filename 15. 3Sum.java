public class Solution {
    
    
    List<List<Integer>> list;
    
    public List<List<Integer>> threeSum(int[] nums) {
        list=new ArrayList<>();
        if(nums.length<3)
            return list;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i==0 || nums[i]!=nums[i-1]) //this judgement statement can reduce much time
                helper(nums, i, 0-nums[i]);
        }
        
        return list;
        
        
    }
    
    public void helper(int[] nums, int index, int sum){
        int i=index+1, j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]>sum){
                j--;
                continue;
            }
            else if(nums[i]+nums[j]<sum){
                i++;
                continue;
            }
            else{
                List<Integer> tmp = new ArrayList<>();
                tmp.add(nums[index]);
                tmp.add(nums[i]);
                tmp.add(nums[j]);
                if(!list.contains(tmp))
                    list.add(tmp);
                i++; j--;
                continue;
            }
        }
        
        return;
    }
    
    
}
