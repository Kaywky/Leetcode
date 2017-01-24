public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int e: nums){
            if(map.get(e)!=null)
                map.put(e, map.get(e)+1);
            else
                map.put(e, 1);
        }
        
        List<Integer>[] times=new List[nums.length+1];
        List<Integer> res=new ArrayList<>();
        
        for(Integer key: map.keySet()){
            int tmp=map.get(key);
            if(times[tmp]==null)
                times[tmp]=new ArrayList<>();
            times[tmp].add(key);
        }
        
        int i=times.length-1;
        while(i>=0 && k>0){
            if(times[i]!=null){
                res.addAll(times[i]);
                k-=times[i].size();
            }
            i--;
        }
        
        return res;
        
    }
}
//refer to discussion
