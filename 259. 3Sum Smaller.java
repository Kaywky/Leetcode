public class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        if(nums.length<=2)
            return 0;
        Arrays.sort(nums);
        if(3*nums[0]>target)
            return 0;
        
        int res=0;
        for(int i=0; i<nums.length; i++){
            int n=nums.length-1, m=n-1;
            int sum=target-nums[i];
            while(m>i && m<n){
                if(nums[m]+nums[n]<sum){
                    res+=m-i;
                    n--; m=n-1;
                }
                else{
                    m--;
                }
                if(m==i && n>m+2){
                    n--; m=n-1;
                }
            }
            
        }
        return res;
    }
}
