/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode quick=head;
        if(head==null)
            return null;

        while(slow!=null && slow.next!=null && quick!=null && quick.next!=null && quick.next.next!=null){
            slow=slow.next;
            quick=quick.next.next;
            if(slow==quick){
                quick=quick.next;
                ListNode find=head;
                while(find!=quick){
                    if(find==slow){
                        find=head;
                        quick=quick.next;
                        continue;
                    }
                    find=find.next;
                }
                return quick;
            }
        }
        
        return null;
        
        
        
    }
}

//slow: O(n^2)
