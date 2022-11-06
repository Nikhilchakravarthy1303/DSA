/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int length(ListNode head)
    {
        int temp=0;
        ListNode n = head;
        while(n!=null)
        {
            n = n.next;
            temp++;
        }
        return temp;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        if( headA==headB)
        {
            return headA;
        }
        if(length(headA)<length(headB))
        {
            return getIntersectionNode(headB,headA);
        }
        while(a!=null)
        {
            if(b == a)
            {
                return a;
            }
            if(a.next == null && b.next != null)
            {
                a = headA;
                b = b.next;
            }
            a = a.next;
        }
        return null;
    }
}
