/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
*  BST Iterator can be implemented by stacks
*
*/
public class BSTIterator {
    Stack<TreeNode> stack = new Stack<TreeNode>();;
    public BSTIterator(TreeNode root) {
        put(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        // return should be consistent with the meaning of the function
        return !stack.empty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode currentNode = stack.pop();
        put(currentNode.right);
        
        return currentNode.val;
    }
    
    // put left nodes into stack from in sequence
    // extract function from BSTIterator() for next()
    private void put(TreeNode root){
        while(root!=null){
            stack.push(root);
            root = root.left;
        }
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */