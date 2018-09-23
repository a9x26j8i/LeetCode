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
    //return IN-ORDER traversal
    // public int kthSmallest(TreeNode root, int k){
    //     int[] res = {0};
    //     int[] sum = {0};
    //     inRecur(root, k, sum, res);
    //     return res[0];
    // }
    // private void inRecur(TreeNode root, int k, int[] sum, int[] res){
    //     if(sum[0] == k){
    //         return;
    //     }else{
    //         if(root == null){
    //             return;
    //         }
    //         inRecur(root.left, k, sum, res);
    //         ++sum[0];
    //         if(sum[0] == k){
    //             res[0] = root.val;
    //             return;
    //         }
    //         inRecur(root.right, k, sum, res);
    //     }
    // }

    
    //counting method, slow
    public int kthSmallest(TreeNode root, int k){
        int count = count(root.left);
        
        while(count != k-1){
            if(count > k-1){
                root = root.left;
                count = count(root.left);
            }else if(count < k-1){
                k -= count+1;
                root = root.right;
                count = count(root.left);
            }else{
                return root.val;
            }
        }
        return root.val;
    }
    HashMap<TreeNode, Integer> map = new HashMap<>();
    private int count(TreeNode root){
        if(map.containsKey(root)){
            return map.get(root);
        }
        
        if(root == null){
            return 0;
        }
        
        int left = count(root.left);
        int right = count(root.right);
        map.put(root, left+right+1);
        return left+right+1;
    }
    
//     private int count(TreeNode root){
//         if(root == null){
//             return 0;
//         }
//         int left = count(root.left);
//         int right = count(root.right);
        
//         return left + right + 1;
//     }
    
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