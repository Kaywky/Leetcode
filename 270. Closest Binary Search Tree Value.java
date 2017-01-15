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
    public int closestValue(TreeNode root, double target) {
        int ans;
        if(root.left==null && root.right==null)
            return root.val;
        if(target>root.val && root.right!=null){
            int next=closestValue(root.right, target);
            return Math.abs(next-target)<Math.abs(root.val-target)?next:root.val;
        }
        if(target<root.val && root.left!=null){
            int next=closestValue(root.left, target);
            return Math.abs(next-target)<Math.abs(root.val-target)?next:root.val;            
        }
        
        return root.val;
    }
}
