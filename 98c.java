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
    //create a static field to count number of invalid nodes
    private static int count=0;
    public boolean isValidBST(TreeNode root) {
        isValidBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return count==0;
    }
    
    private void isValidBSTHelper(TreeNode root, int min, int max){
        if(root.val>min && root.val<max){
            if(root.left != null){
                isValidBSTHelper(root.left,  min, root.val);
            }
            if(root.right != null){
                isValidBSTHelper(root.right, root.val, max);
            }
        }else{
            count++;
        }
        return;
    }
}