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
    boolean res;
    boolean count=true;
    
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        max=Integer.MIN_VALUE;
        res=true;
        helper(root);
        return res;
    }
    
    public void helper(TreeNode node){
        if(node==null)
            return;
        helper(node.left);
        if(count){
            max=node.val;
            count=false;
        }
        else{
        if(node.val<=max){
            res=false;
            return;
        }
        max=node.val;
        if(!res)
            return;
        }
        helper(node.right);
        return;
    }
    
}
