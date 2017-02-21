/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    Map<Integer, Integer> map = new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root==null)
            return new int[0];
        helper(root);
        int max = 0;
        for(Integer key : map.keySet()){
            max = Math.max(max, map.get(key));
        }
        for(Integer key : map.keySet()){
            if(map.get(key)==max)
                list.add(key);
        }
        int[] res = new int[list.size()];
        int i=0;
        for(Integer e : list){
            res[i++]=e;
        }
        return res;
        
    }
    
    private int helper(TreeNode node){
        if(node==null)
            return 0;
        int sum = node.val + helper(node.left) + helper(node.right);
        if(map.containsKey(sum)){
            map.put(sum, map.get(sum)+1);
        }
        else{
            map.put(sum, 1);
        }
        return sum;
    }
}
