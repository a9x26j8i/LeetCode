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
    public static int result=0, remain;
    public int kthSmallest(TreeNode root, int k) {
        int ret;
        remain = k;
        helper(root);
        ret = result;
        //clear static variable record
        result =0;
        
        return ret;
    }
    private void helper(TreeNode root){
        if(root == null){
            return;
        }
        if(remain==1){
            result = root.val;
        }
        
        helper(root.left);
        remain -- ;
        if(remain == 0){result = root.val;}
        helper(root.right);
    }
}