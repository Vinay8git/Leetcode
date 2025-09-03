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
// public class Solution1 {
//     public ListNode detectCycle(ListNode head) {
//         Set<ListNode> seen = new HashSet<>();
//         if(head==null || head.next==null) return null;
//         if(head.next == head) return head;
//         ListNode temp = head;
//         while(temp.next!=null && !seen.contains(temp))
//         {
//             seen.add(temp);
//             temp=temp.next;            
//         }
//         return temp.next==null? null : temp;
//     }
// }

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) return null;

        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;        
    }
}