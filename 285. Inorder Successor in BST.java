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
    boolean check=false;
    Deque<TreeNode> stack=new ArrayDeque<>();
    TreeNode res;
    
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root==null)
            return root;
        inorderSuccessor(root.left, p);
        if(check) //still: pay attention to judgement statement
            return res;
        if(stack.peek()==p){
            check=true;
            res=new TreeNode(root.val);
            return res;
        }
        stack.push(root);
        inorderSuccessor(root.right, p);
        
        return res;
        
    }
    

}
