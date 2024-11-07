class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base cases
        if (p == null && q == null) {
            return true; // Both nodes are null, so they are the same
        }
        if (p == null || q == null) {
            return false; // One node is null, the other is not, so not the same
        }
        
        // Check if the values of the current nodes are the same
        if (p.val != q.val) {
            return false; // Values don't match, so the trees are not the same
        }

        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
