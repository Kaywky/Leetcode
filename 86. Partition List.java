/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null)
            return head;
        
        ListNode keephead=new ListNode(0);
        keephead.next=head;
        ListNode slow=keephead;
        ListNode fast=keephead;
        
        
        while(fast!=null && fast.next!=null){
            System.out.println(slow.val+"><"+fast.val);
            if(fast.next.val<x && slow!=fast){
                ListNode tmp2=fast.next;
                fast.next=tmp2.next;
                tmp2.next=slow.next;
                slow.next=tmp2;
                slow=slow.next;
            }
            else if(fast.next.val<x && slow==fast){
                slow=slow.next;
                fast=fast.next;
            }
            else{
                fast=fast.next;
            }
        }
        System.out.println("?");
        
        return keephead.next;
    }
}
