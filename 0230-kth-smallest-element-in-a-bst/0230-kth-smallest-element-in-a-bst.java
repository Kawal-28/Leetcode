/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int[] arr = new int[10000];
    int index = 0;

    public void inorder(TreeNode root) {
        if (root == null) return;
        
        inorder(root.left);
        arr[index++] = root.val;
        inorder(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return arr[k - 1];
    }
}