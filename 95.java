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
    public List<TreeNode> generateTrees(int n) {
        if(n==0){
            List<TreeNode> ret = new ArrayList<TreeNode>();
            return ret;
        }
        return subtree(1, n);
    } 
    private List<TreeNode> subtree(int start, int end){
        List<TreeNode> ret = new ArrayList<TreeNode>();
        //2.Terminal Condition 
        if(start>end){
            ret.add(null);
            return ret;
        }
        if(start==end){
            ret.add(new TreeNode(start));
            return ret;
        }

        for(int i=start; i<=end; i++){
            //1.divide the tree into sub-BSTs
            List<TreeNode> leftTrees;
            List<TreeNode> rightTrees;
            leftTrees = subtree(start, i-1);
            rightTrees = subtree(i+1, end);
            //1.1 combine left and right sub-trees into bigger ones
            for(TreeNode l:leftTrees){
                for(TreeNode r:rightTrees){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    //add into the container of same recusion level
                    ret.add(root);
                }
            }
        }
        //return result of this level recursion(different from backtracking)
        return ret;
    }
}

