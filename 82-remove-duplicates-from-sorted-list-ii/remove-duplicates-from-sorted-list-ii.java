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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null) 
            return head;

        
        ListNode dummy = new ListNode(-1);

        ListNode temp = head, ptr=dummy;
        // ListNode prev = null, cur = head, fwd=head.next;

        // while(cur.next != null)
        // {
        //     if(cur.val == next.val)
        //     {
        //         prev.next = next.next;
        //     }
        // }
        while(temp != null)
        {
            if(temp.next==null)
            {
                ptr.next=new ListNode(temp.val);
                break;
            }
            if(temp.val != temp.next.val)
            {
                ptr.next = new ListNode(temp.val);
                ptr = ptr.next;
            }
            else
            {
                while(temp.val == temp.next.val)
                {
                    temp = temp.next;
                    if(temp.next==null)
                        break;
                }
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}