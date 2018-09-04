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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        if(root != null){
            q.add(root);
        }else{
            return res;
        }    
        
        while(!q.isEmpty()){
            List<Integer> list = new LinkedList<Integer>();
            TreeNode node;
            int iterSize = q.size();//!!!!MUST save q.size() as a temp virable
            for(int i=0; i<iterSize; i++){
                System.out.println("i = " + i);
                node = q.poll();
                list.add(node.val);
                System.out.println(node.val);
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            res.add(list);
        }
        
        return res;
    }
}