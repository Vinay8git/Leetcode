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
        Set<ListNode> seen = new HashSet<>();
        if(head==null || head.next==null) return null;
        if(head.next == head) return head;
        ListNode temp = head;
        while(temp.next!=null && !seen.contains(temp))
        {
            seen.add(temp);
            temp=temp.next;            
        }
        return temp.next==null? null : temp;
    }
}