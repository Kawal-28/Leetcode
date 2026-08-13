/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //find length of both the lists
        //increment the bigger list by m-n times
        //when temp1==temp2 return
        ListNode temp1=headA;
        ListNode temp2=headB;
        int count1=0,count2=0;
        int x=-1;
        while(temp1!=null){
            count1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            count2++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;
        if(count1>count2){
            for(int i=0;i<count1-count2;i++){
                temp1=temp1.next;
            }
        }
        else{
            for(int i=0;i<count2-count1;i++){
                temp2=temp2.next;
            }
        }
        while(temp1!=null & temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            else{
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        return null;
    }
}