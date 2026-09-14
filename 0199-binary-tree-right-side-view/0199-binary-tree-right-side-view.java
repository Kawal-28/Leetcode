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
    public void solve(TreeNode root,int depth,List<Integer> ans){
        //Reverse Preorder as it is right view of binary tree
        //we have to take right value
        if(root ==null) return ;
        if(ans.size()==depth){
            ans.add(root.val);
        }
        solve(root.right,depth+1,ans);
        solve(root.left,depth+1,ans);
        //return ans;
    }
    public List rightSideView(TreeNode root) {
        List ans = new ArrayList<>();
        solve(root, 0, ans);
        return ans;
    }
}


// class Solution {
//     public List<Integer> rightSideView(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();
//         if (root == null) return ans;
        
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);
        
//         while (!q.isEmpty()) {
//             int size = q.size();
            
//             for (int i = 0; i < size; i++) {
//                 TreeNode node = q.poll();
                
//                 if (i == size - 1) {
//                     ans.add(node.val);
//                 }
                
//                 if (node.left != null) {
//                     q.add(node.left);
//                 }
//                 if (node.right != null) {
//                     q.add(node.right);
//                 }
//             }
//         }
//         return ans;
//     }
// }