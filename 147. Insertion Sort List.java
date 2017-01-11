/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
         ListNode sort=head;
         if(head==null || head.next==null)
             return head;
         while(sort!=null && sort.next!=null){
             if(sort.val<=sort.next.val){
                 sort=sort.next;
                 continue;
             }
             else{
                 ListNode again=head;
                 if(sort.next.val<=head.val){
                     ListNode tmp=sort.next;
                     sort.next=tmp.next;
                     tmp.next=head;
                     head=tmp;
                     continue;
                 }
                 while(again.next.val<=sort.next.val){
                     again=again.next;
                     continue;
                 }
                 ListNode temp=sort.next;
                 sort.next=temp.next;
                 temp.next=again.next;
                 again.next=temp;
                 continue;
             }
                 
         }
         return head;
    }
}
