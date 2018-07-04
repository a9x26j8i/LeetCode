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
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, null, null);
    }
    private boolean isValidBSTHelper(TreeNode root, Integer min, Integer max){
        //iteration terminal
        //boolean judgement: use current root as the leading one.(can be null)
        if(root == null) return true;
        if(max!=null&&max<=root.val) return false;
        if(min!=null&&root.val<=min) return false;
        return isValidBSTHelper(root.left, min, root.val) && isValidBSTHelper(root.right, root.val, max);
    }
}