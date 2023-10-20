package LinkedList;

class Solution {
    // approach - 1 (recusively by only changing links)
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode reveredLLHead = reverseList(head.next); // recursily reverse right part
        
        head.next.next = head; // connect curr head to the revered LL tail
        head.next = null;
        return reveredLLHead; // return reveredLL head
    }
}