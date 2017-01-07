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

    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();      
        if(root==null)
            return list;
        int min=0;
        int max=0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<Integer> level = new LinkedList<>(); //sometimes we need to build two queue
        Queue<TreeNode> que = new LinkedList<>();
        
        que.offer(root);
        level.offer(0);
        
        while(!que.isEmpty()){
            int len=que.size();
            for(int i=0; i<len; i++){
                TreeNode node = que.poll();
                int l = level.poll();
                min=Math.min(l, min);
                max=Math.max(l, max);
                if(!map.containsKey(l))
                    map.put(l, new ArrayList<Integer>());
                map.get(l).add(node.val);
                if(node.left!=null){
                    que.offer(node.left);
                    level.offer(l-1);
                }
                if(node.right!=null){
                    que.offer(node.right);
                    level.offer(l+1);
                }
            }
        }
        
        for(int i=min; i<=max; i++){
            list.add(map.get(i));
        }
        return list;
        
    }
    
    
}
