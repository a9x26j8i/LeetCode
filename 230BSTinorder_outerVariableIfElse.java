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
    //return traversal
    public int kthSmallest(TreeNode root, int k){
        int[] res = {0};
        int[] sum = {0};
        inRecur(root, k, sum, res);
        return res[0];
    }
    private void inRecur(TreeNode root, int k, int[] sum, int[] res){
        if(sum[0] == k){
            return;
        }else{
            if(root == null){
                return;
            }
            inRecur(root.left, k, sum, res);
            ++sum[0];
            if(sum[0] == k){
                res[0] = root.val;
                return;
            }
            inRecur(root.right, k, sum, res);
        }
    }
    
     //All-traversal
    // public int kthSmallest(TreeNode root, int k) {
    //     int[] res = {0};
    //     int[] sum = {0};
    //     inRecur(root, k, sum, res);
    //     return res[0];    
    // }
    // private void inRecur(TreeNode root, int k, int[] sum, int[] res){
    //     if(root == null){
    //         return;
    //     }
    //     //left
    //     inRecur(root.left, k, sum, res);
    //     sum[0]++;
    //     if(sum[0] == k){
    //         res[0] = root.val;
    //     }
    //     //right
    //     inRecur(root.right, k, sum, res);
    // }
}