/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode tmp = ans;
        int sum = 0;
        int add = 0;
        while(l1!=null && l2!=null){
            sum = l1.val + l2.val + add;
            add = sum/10;
            sum = sum%10;
            tmp.next = new ListNode(sum);
            tmp = tmp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1!=null){
            sum = l1.val + add;
            add = sum/10;
            sum = sum%10;
            tmp.next = new ListNode(sum);
            tmp = tmp.next;
            l1 = l1.next;
        }
        while(l2!=null){
            sum = l2.val + add;
            add = sum/10;
            sum = sum%10;
            tmp.next = new ListNode(sum);
            tmp = tmp.next;
            l2 = l2.next;
        }
        if(add==1){
            tmp.next = new ListNode(add);
        }
        
        return ans.next;

    }
}
