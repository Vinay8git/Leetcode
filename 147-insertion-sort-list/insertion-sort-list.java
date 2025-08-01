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
    public ListNode insertionSortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }

        Collections.sort(list);
        ListNode dummy = new ListNode(-1);
        temp = dummy;
        for(int n : list)
        {
            dummy.next = new ListNode(n);
            dummy = dummy.next;
        }
        return temp.next;
    }
}