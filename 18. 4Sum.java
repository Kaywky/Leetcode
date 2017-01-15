public class Solution {
    
    List<List<Integer>> list;
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        list=new ArrayList<>();
        if(nums.length<4)
            return list;
        List<Integer> tmp = new ArrayList<>();    
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            tmp.add(nums[i]);
            for(int j=i+1; j<nums.length; j++){
                if(j>i+1 && nums[j]==nums[j-1])
                    continue;
                tmp.add(nums[j]);
                int m=j+1, n=nums.length-1;
                int tar = target-nums[i]-nums[j];
                while(m<n){
                    if(nums[m]+nums[n]==tar){
                        list.add(Arrays.asList(nums[i], nums[j], nums[m], nums[n]));
                        while(m<n && nums[m]==nums[m+1]) m++;
                        while(m<n && nums[n]==nums[n-1]) n--;
                        m++; n--;
                    }
                    else if(nums[m]+nums[n]<tar)
                        m++;
                    else
                        n--;
                }
                tmp.remove(1);
            }
            tmp.remove(0);
        }
        
        
        return list;
        
    }
}

//discussion中有一个解法，巧妙利用了边界条件，可以省去很多时间；
