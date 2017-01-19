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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        
        helper(list, root);
        
        return list.get(k-1);

    }
    
    public void helper(List<Integer> list, TreeNode root){
        if(root==null)
            return;
        else{
            helper(list, root.left);
            list.add(root.val);
            helper(list, root.right);
        }
        
        return;
    }
    
}

