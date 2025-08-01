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
class Solution1 {
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

class Solution2 {
    private void insertionSort(List<Integer> al)
    {
        for(int i=1;i<al.size();i++)
        {
            int key = al.get(i);
            int j = i-1;
            
            while(j>=0 && al.get(j)>key)
            {
                al.set(j+1, al.get(j));
                j-=1;
            }
            al.set(j+1, key);

        }
        // return al;
    }
    public ListNode insertionSortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }

        insertionSort(list);
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


class Solution3 {
    private List<Integer> insertionSort(List<Integer> al)
    {
        for(int i=1;i<al.size();i++)
        {
            int key = al.get(i);
            int j = i-1;
            
            while(j>=0 && al.get(j)>key)
            {
                al.set(j+1, al.get(j));
                j-=1;
            }
            al.set(j+1, key);

        }
        return al;
    }
    public ListNode insertionSortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }

        list = insertionSort(list);
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

class Solution4 {
    private void insertionSort(List<Integer> al, int n)
    {
        if(n==0)
            return;

        insertionSort(al, n-1);

        int j = n-1;
        int key = al.get(n);
        while(j>=0 && al.get(j) > key)
        {
            al.set(j+1, al.get(j));
            j-=1;
        }
        al.set(j+1, key);
        return;
    }
    public ListNode insertionSortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }

        insertionSort(list, list.size()-1);
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

class Solution {
    private List<Integer> insertionSort(List<Integer> al, int i, int n)
    {
        if(i>=n)
            return al;

        // insertionSort(al, n-1);

        int j = i-1;
        int key = al.get(i);
        while(j>=0 && al.get(j) > key)
        {
            al.set(j+1, al.get(j));
            j-=1;
        }
        al.set(j+1, key);

        return insertionSort(al, i+1, n);

    }
    public ListNode insertionSortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }

        insertionSort(list, 1, list.size());
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