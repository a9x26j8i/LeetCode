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
    //totally 3 terminal bases: 2null, 1null, val!=
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //merging two terminal bases together taking advantage of their <b>same point</b>:have null.
        if(p==null||q==null){
            return p==null&&q==null;
        }
        //one of terminal bases: p.val==q.val.
        return p.val==q.val&&isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);  
    }
}