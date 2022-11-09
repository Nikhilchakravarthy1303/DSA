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
        ListNode temp = head;
        int i=0;
        while(temp!=null)
        {
            temp = temp.next;
            i++;
        }
        return i;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
        {
            return null;
        }
        int k = length(head)-n;
        if(n>length(head) || n<=0)
        {
            return null;
        }
        if(length(head) == n)
        {
            head = head.next;
            return head;
        }
        if(n==1)
        {
            ListNode temp = head;
            while(temp.next.next!=null)
            {
                temp = temp.next;
            }
            temp.next = null;
            return head;
        }

        int i=0;
        ListNode temp = head;
        while(i<k-1)
        {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
}
