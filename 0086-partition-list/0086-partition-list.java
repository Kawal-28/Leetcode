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
    public ListNode partition(ListNode head, int x) {
        ListNode p1=new ListNode(0); //smaller
        ListNode p2=new ListNode(0);
        //greater
        ListNode dummy1=p1;
        ListNode dummy2=p2;


        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                dummy1.next=temp;
                dummy1=dummy1.next;
            }
            else{
                dummy2.next=temp;
                dummy2=dummy2.next;
            }
            temp=temp.next;
        }
        dummy2.next=null;
        dummy1.next=p2.next;
        
        return p1.next;
    
    }
}