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
    public int length(ListNode head)
    {
        int i = 0;
            ListNode temp = head;
        while(temp!=null)
        {
            temp =temp.next;
            i++;
        }
        return i;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null )
        {
            return null;
        }
        if(length(head) == 1)
        {
            return head;
        }
        int i=0;
        while(i<k)
        {
            ListNode temp = head;
            while(temp.next.next!=null)
            {
                temp = temp.next;
            }
            ListNode start = temp.next;
            ListNode init = temp.next;
            temp.next = null;
            start.next = head;
            head = init;

            i++;
        }
        return head;
    }
}
