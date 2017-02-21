/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public ListNode sortList(ListNode head) {
        if(head==null)
            return head;
        if(head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next=null;
        return merge(sortList(head), sortList(tmp));
    }
    
    private ListNode merge(ListNode left, ListNode right){
        ListNode root=new ListNode(0);
        ListNode tmp=root;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                tmp.next=left;
                left=left.next;
            }
            else{
                tmp.next=right;
                right=right.next;
            }
            tmp=tmp.next;
        }
        if(left!=null)
            tmp.next=left;
        if(right!=null)
            tmp.next=right;
        return root.next;
    }
    
}

//not with constant space
