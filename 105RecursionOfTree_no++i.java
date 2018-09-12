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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return recursion(0, inorder.length-1, inorder, 0, preorder);
    }
    
    public TreeNode recursion(int left, int right, int[] inorder, int pos, int[] preorder){
        
        
        if(pos >= preorder.length){
            return null;
        }
        if(left > right){
            return null;
        }
        
        TreeNode node = new TreeNode(preorder[pos]);
        int splitPoint = 0;
        for(int temp = left; temp <= right; temp++){
            if(preorder[pos] == inorder[temp]){
                splitPoint = temp;
                break;
            }
        }
        //discern the influce for pos itself between ++pos and pos+1
        node.left = recursion(left, splitPoint-1, inorder, pos+1, preorder); 
        //!!!In recursion. NO pos++ or ++pos, use pos+1 to pass parameters
        //pos+splitPoint-left+1
        node.right = recursion(splitPoint+1, right, inorder,pos+splitPoint-left+1 , preorder);
        
        return node;
    }
}
