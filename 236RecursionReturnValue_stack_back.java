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
    
    //local variable can't stack back! Use return value!

    //Thought 1: mark globally after having found the first one, mark the return path,
    //           because of the recursive structure(a.k.a return path can be of other subtree), 
    //           the path will be recursively dispersed.
    //           FAIL
    //           全局变量因递归型结构，中间会有其他符合条件的递归子结构
    //Thought 2: mark twice globally, can not determine if return to the above one.
    
    //采用返回值：可向上传递，在每个节点进行条件判断、总结、往回传       

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return DFS(root, p, q);
    }
    private TreeNode DFS(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = DFS(root.left, p, q);
        TreeNode right = DFS(root.right, p, q);
        
        if(left!=null && right!=null){
            return root;
        }
        if(left!=null){
            return left;
        }
        if(right!=null){
            return right;
        }
        return null;
        
    }
}