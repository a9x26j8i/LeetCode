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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1); 
    }
    //no need to pass TreeNode node.left or node.right;
    //In new functions: root = new NodeTree(10) will create "local objects"!!
    private TreeNode helper(int[] nums, int start, int end){ 
        TreeNode root;
        if(start==end){
            root = new TreeNode(nums[start]);
            return root;
        }if(start>end){
            return null;
        }
        int middle = (start+end)/2;
        root = new TreeNode(nums[middle]);
        root.left = helper(nums, start, middle-1);
        root.right = helper(nums, middle+1, end);
        return root;
    }
}