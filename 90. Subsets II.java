public class Solution {
    
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(nums.length==0)
            return list;
        Arrays.sort(nums);
        list.add(new ArrayList<Integer>());
        helper(new ArrayList<Integer>(), nums, 0);
        
        return list;
        
    }
    
    
    public void helper(List<Integer> tmp, int[] nums, int index){
        if(index<nums.length){
            for(int i=index; i<nums.length; i++){
                List<Integer> l=new ArrayList<>(tmp);
                l.add(nums[i]);
                if(list.contains(l))
                    continue;
                list.add(l);
                helper(l, nums, i+1);
            }
        }
        return;
        
    }
    
}
