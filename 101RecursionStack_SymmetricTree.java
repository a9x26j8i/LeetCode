/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSymmetricR(root.left, root.right);
    }
    //recursion
    private boolean isSymmetricR(TreeNode left, TreeNode right){
        if(left==null && right==null){
            return true;
        }else if(left==null || right==null){
            return false;
        //    if(left==null || right==null)
        // return left==right;             
        }else {
            return left.val== right.val && isSymmetricR(left.left, right.right) && isSymmetricR(left.right, right.left); 
        }
    }
}