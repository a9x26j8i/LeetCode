/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    NONE-RECURSION VERSION
    public void connect(TreeLinkNode root){
        if(root==null || root.left==null){
            return;
        }
        TreeLinkNode level = root;//keep a variable to track the level
        TreeLinkNode temp;//level traversal cursor
        while(level.left != null){
            temp = level;
            temp.left.next = temp.right;
            while(temp.next != null){
                temp.right.next = temp.next.left;
                temp = temp.next;
                temp.left.next = temp.right;
            }   
            level = level.left;//one deeper level
        }
    }
   
    //RECURSION VERSION: minimum local relationship! and pass on
//     public void connect(TreeLinkNode root){
//         if(root == null){
//             return;
//         }
//         if(root.left == null){
//             return;
//         }
//         root.left.next = root.right;
        
//         if(root.next != null){
//             root.right.next = root.next.left;
//         }
        
//         connect(root.left);
//         connect(root.right);
//     }
    
//     public void connect(TreeLinkNode root) {
//     if(root == null)
//         return;
        
//     if(root.left != null){
//         root.left.next = root.right;
//         if(root.next != null)
//             root.right.next = root.next.left;
//     }
    
//     connect(root.left);
//     connect(root.right);
// }
    
    
//WRONG: MEMORY LIMIT EXCEED    
//     public void connect(TreeLinkNode root) {
//         if(root == null){
//             return;
//         }
        
//         LinkedList<TreeLinkNode> q = new LinkedList<>();
//         q.add(root);
        
//         while(!q.isEmpty()){
//             int size = q.size();
            
//             TreeLinkNode temp1;
//             TreeLinkNode temp2;
//             temp1 = q.poll();
//             if(temp1.left != null){
//                 q.add(temp1.left);
//             }
//             if(temp1.right != null){
//                 q.add(temp1.right);
//             }
//             for(int i=1; i<size; i++){
//                 temp2 = q.poll();
//                 if(temp2.left != null){
//                 q.add(temp1.left);
//                 }
//                 if(temp2.right != null){
//                     q.add(temp1.right);
//                 }
//                 temp1.next = temp2;
//                 temp1 = temp2;
//             }
//         } 
//     }
}