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
    
    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        int left=helper(root.left);
        int right=helper(root.right);
        return left==right? (1<<left)+countNodes(root.right):(1<<right)+countNodes(root.left);
        
    }
    
    public int helper(TreeNode node){
        if(node==null)
            return 0;
        int height=0;
        while(node!=null){
            height++;
            node=node.left;
        }
        return height;
    }
    
}

//remark: refer to ideas from discussion forum;
