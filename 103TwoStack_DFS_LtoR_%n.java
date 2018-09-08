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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> res = new LinkedList<>();
        DFS(res, 0, root);
        return res;
    }
    //***DFS traverse each row from LEFT TO RIGHT,
    private void DFS(List<List<Integer>> res, int level, TreeNode root){
        if(root == null){
            return;
        }
        if(res.size() < level+1){
            LinkedList<Integer> newrow = new LinkedList<Integer>();
            res.add(newrow);
        }
        List<Integer> row = res.get(level);
        if(level%2==0){
            row.add(new Integer(root.val));
        }else{
            row.add(0, new Integer(root.val));
        }
        DFS(res, level+1, root.left);
        DFS(res, level+1, root.right);
        
    }
    private List<List<Integer>> twoStack(TreeNode root){
        List<List<Integer>> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        boolean lr = true;
        if(root == null)    return res;
        stack.push(root);
        
        TreeNode tempNode;
        LinkedList<Integer> iter;
        //package one ZIG and one ZAG into ONE UNIT
        while(!stack.isEmpty()){
            iter = new LinkedList<>();
            while(!stack.isEmpty()){
                tempNode = stack.pop();
                iter.add(tempNode.val);
                if(tempNode.left!=null) stack2.push(tempNode.left);
                if(tempNode.right!=null) stack2.push(tempNode.right);
            }
            res.add(iter);
            
            iter = new LinkedList<>();
            while(!stack2.isEmpty()){
                tempNode = stack2.pop();
                iter.add(tempNode.val);
                if(tempNode.right!=null) stack.push(tempNode.right);
                if(tempNode.left!=null) stack.push(tempNode.left);
            }
            if(!iter.isEmpty()){
                res.add(iter);   
            }
        }
        return res;
    }
    
}