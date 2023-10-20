package LinkedList;

// Q.10. Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x. ✔️


class Solution {
/* ✔️⭐Approach - 1 
    // idea : create 2 dummyNodes 'smallerDummy' 'largerDummy' and in the smaller dummy node insert the nodes that are smaller then x and in larger insert those who are equal or larger then x, then at the end attach largerDumm y list at the end of smaller one (make sure u insert the copies of data of original list into the smaller and larger dummy lists)
    // T : O(n)
    // S : O(m)
*/
    public ListNode partition(ListNode head, int x) {

        ListNode smallDummyHead = null;
        ListNode smallDummyTail = smallDummyHead;

        ListNode largeDummyHead = null;
        ListNode largeDummyTail = largeDummyHead;

        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){ // insert node in smallDummyList
                if(smallDummyHead == null){
                    smallDummyHead = new ListNode(temp.val); // insert a copy of temp into smaller dummy list
                    smallDummyTail = smallDummyHead;
                }
                else{
                    smallDummyTail.next = new ListNode(temp.val);
                    smallDummyTail = smallDummyTail.next;
                }
            }
            else{ // insert node in largeDummyList
                if(largeDummyHead == null){
                    largeDummyHead = new ListNode(temp.val); // insert a copy of temp into larger dummy list
                    largeDummyTail = largeDummyHead;
                }
                else{
                    largeDummyTail.next = new ListNode(temp.val);
                    largeDummyTail = largeDummyTail.next;
                }
            }

            temp = temp.next;
        }

        if(smallDummyTail != null)
            smallDummyTail.next = largeDummyHead;
        else return largeDummyHead; // in case smaller list is empty, return larger one
        
        return smallDummyHead;
    }
}