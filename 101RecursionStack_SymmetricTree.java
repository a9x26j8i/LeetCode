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
    public boolean isSymmetric(TreeNode root) {
        // if(root == null) return true;
        // return isSymmetricR(root.left, root.right);
        
        // return isSymmetricIS(root);
        
        return isSymmetricISC(root);
    }
    //ITERATION BY STACK CONCISE
    private boolean isSymmetricISC(TreeNode root){
        if(root == null) return true;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root.left);
        stack.push(root.right);
        TreeNode left, right;
        
        while(!stack.empty()){
            left = stack.pop();
            right = stack.pop();
            
            if(left == null && right == null){
                continue;
            }
            if(left==null || right == null || left.val != right.val){
                return false;
            }
            stack.push(left.left);
            stack.push(right.right);
            stack.push(left.right);
            stack.push(right.left);
        }
        return true;
    }
    //RECURSION
    private boolean isSymmetricR(TreeNode left, TreeNode right){
        if(left==null && right==null){
            return true;
        }else if(left==null || right==null){
            return false;          
        }else {
            return left.val== right.val && isSymmetricR(left.left, right.right) && isSymmetricR(left.right, right.left); 
        }
    }
    
    //ITERATION BY STACK
    private boolean isSymmetricIS(TreeNode root){
        if(root==null) return true;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode left, right;
        if(root.left == null && root.right == null){
            return true;
        }else if(root.left == null || root.right == null){
            return false;
        }
        stack.push(root.left);
        stack.push(root.right);
        
        while(!stack.empty()){
            left=stack.pop();
            right=stack.pop();
            
            if(left.val != right.val) return false;
            if(left.left == null && right.right == null){
                ;
            }else if(left.left == null || right.right == null){
                return false;
            }
            if(left.left != null){
                stack.push(left.left);    
            }
            if(right.right != null){
                stack.push(right.right);
            }
            
            if(left.right == null && right.left == null){
                ;
            }else if(left.right == null || right.left == null){
                return false;
            }
            if(right.left != null){
                stack.push(right.left);    
            }
            if(left.right != null){
                stack.push(left.right);
            }
        }
        return true;
    }
    //ITERATION BY QUEUE
    private boolean isSymmetricIQ(TreeNode root){
        //can be found on https://leetcode.com/problems/symmetric-tree/discuss/33054/Recursive-and-non-recursive-solutions-in-Java
        return true;
    }
}

