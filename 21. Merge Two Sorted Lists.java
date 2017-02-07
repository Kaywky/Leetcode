/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null)
            return l1;
        
        ListNode res=new ListNode(0);
        ListNode ans=res;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                res.next=l1;
                l1=l1.next;
            }
            else{
                res.next=l2;
                l2=l2.next;
            }
            res=res.next;
        }
        
        while(l1!=null){
            res.next=l1;
            l1=l1.next;
            res=res.next;
        }
        while(l2!=null){
            res.next=l2;
            l2=l2.next;
            res=res.next;
        }
        
        return ans.next;
    }
}
