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
    int max;
    
    public int maxPathSum(TreeNode root) {
        if(root==null)
            return 0;
        max=root.val;
        helper(root);
        return max;

    }
    
    public int helper(TreeNode root){
        if(root==null)
            return 0;
        else{
            int left=helper(root.left);
            int right=helper(root.right);
            int resval= Math.max(root.val, Math.max(left+root.val, right+root.val));
            max=Math.max(max,Math.max(resval, left+right+root.val));
            return resval;
        }
    }
  
}
