/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        ListNode fwd=null;

        while(curr!=null){
            fwd=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fwd;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        // Find the Middle:
        // Reverse the Second Half
        // Compare Twin Pairs
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;

        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2 = reverseList(slow);

        //reverseList(head2);
        
        int maxSum=0;
        while(head2!=null){
            int current=temp.val+head2.val;
            maxSum=Math.max(current,maxSum);
            temp=temp.next;
            head2=head2.next;
        }
        return maxSum;

    }
}





