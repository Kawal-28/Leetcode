/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        
        Node leftMost = root;
        
        while (leftMost.left != null) {
            Node curr = leftMost;
            
            while (curr != null) {
                curr.left.next = curr.right;

                if (curr.next != null) {
                    curr.right.next = curr.next.left;
                }
                
                curr = curr.next;
            }
            
            leftMost = leftMost.left;
        }
        
        return root;
    }
}


// class Solution {
//     public Node connect(Node root) {
//         if (root == null) return null;
//         Queue<Node> q = new LinkedList<>();
//         q.add(root);
        
//         while (!q.isEmpty()) {
//             int n = q.size();
//             Node prev = null;
            
//             for (int i = 0; i < n; i++) {
//                 Node curr = q.poll();
//                 if (prev != null) {
//                     prev.next = curr;
//                 }
//                 prev = curr;
                
//                 if (curr.left != null) {
//                     q.add(curr.left);
//                 }
//                 if (curr.right != null) {
//                     q.add(curr.right);
//                 }
//             }
//             prev.next = null; 
//         }
//         return root;
//     }
// }
