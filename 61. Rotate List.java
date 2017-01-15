/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
            
        int count=1;
        ListNode tmp=head;
        while(tmp.next!=null){
            count++;
            tmp=tmp.next;
        }
        ListNode tail=tmp;
        k=k%count;
        
        if(k==0)
            return head;
        
        int order=1;
        tmp=head;
        while(order<count-k){
            tmp=tmp.next;
            order++;
        }
        
        ListNode newhead=tmp.next;
        tail.next=head;
        tmp.next=null;
        
        return newhead;

    }
}
