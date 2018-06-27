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
    public List<Integer> preorderTraversal(TreeNode root) {
        //create list of integer to save sequence
        List<Integer> preseq = new ArrayList<Integer>();
        //stack for iteration
        Stack<TreeNode> backups = new Stack<TreeNode>();

        while(root!=null){
            //visit root first
            preseq.add(root.val);
            //lookup left & save the backup node(left node)
            if(root.left!=null){
                if(root.right!=null)
                backups.push(root.right);
                root = root.left;
            }
            //no left, then go for right node
            else if(root.right!=null)
                root = root.right;
            //no left or right, go for backups.
            else if(!backups.empty())
                root = backups.pop();
            else break;
        }
        return preseq;
    }
}