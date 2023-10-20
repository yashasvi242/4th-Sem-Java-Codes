package LinkedList;

/* ✔️Approach - 1 [java] (finding smaller node and attaching a copy of that node in the end of dummyList)

        T : O(n)
        S : O(n)

*/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummyHead = new ListNode(-1);
        ListNode dummyTail = dummyHead;

        // we compare the 2 nodes of 2 lists, whichever is smaller in value insert it at tail of dummynode and increment it by 1 place to the right
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while(temp1 != null && temp2 != null){ // loop will run while at both of the nodes are not null
            
            if(temp1.val < temp2.val){ // inser at tail
                dummyTail.next = new ListNode(temp1.val); // create copy of temp1 node and insert it in dummy tail
                dummyTail = dummyTail.next;
                temp1 = temp1.next; // update temp1
            } 
            else{
                dummyTail.next = new ListNode(temp2.val); // create copy of temp1 node and insert it in dummy tail
                dummyTail = dummyTail.next;
                temp2 = temp2.next; // update temp1
            }
        }

        // if any 1 list is ended and other is still left then insert all its nodes into the end of dummyList
        while(temp1 != null){
            dummyTail.next = new ListNode(temp1.val); // create copy of temp1 node and insert it in dummy tail
            dummyTail = dummyTail.next;
            temp1 = temp1.next; // update temp1
        }

        while(temp2 != null){
            dummyTail.next = new ListNode(temp2.val); // create copy of temp1 node and insert it in dummy tail
            dummyTail = dummyTail.next;
            temp2 = temp2.next; // update temp1
        }


        return dummyHead.next;
    }
}