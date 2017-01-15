public class Solution {
    public int maxArea(int[] height) {
        /*
        int res=0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(height[0], 0);
        for(int j=1; j<height.length; j++){
            if(!map.containsKey(height[j]))
                map.put(height[j], j);
            int m=j-1;
            for(Integer e: map.keySet()){
                res=Math.max(res, (j-map.get(e))*(Math.min(e, height[j])));
            }
            
        }
         return res;
         
         remark: my solution has O(n^2) time complexity, so it comes to Time Exceeded error;
         using two pointers can avoid that and make O(n);
         
         */
         
         int res=0;
         int left=0;
         int right=height.length-1;
         
         while(left<right){
             res=Math.max(res, Math.min(height[right],height[left])*(right-left));
             if(height[left]<=height[right])
                 left++;
            else
                right--;
         }
         
         return res;
         
         
    
    }
}
