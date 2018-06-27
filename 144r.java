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
    public static List<Integer> preseq = new ArrayList<Integer>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
            return preseq;
        
        preseq.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return preseq;
    }
}