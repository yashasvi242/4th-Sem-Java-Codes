package LinkedList;

class Solution {
/* ✔️Approach - 1 (using arrayList)
    // idea : storing nodes in arrayList, then changing list ussing dummy list
    T : O(n)
    S : O(n)
*/
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null)
            return null;
            
        ArrayList<ListNode> arr = new ArrayList<ListNode>();
        ListNode temp = head;
        while(temp != null){ // insert all nodes into array
            arr.add(temp);
            temp = temp.next;
        }

        // push the non duplicate nodes into new list
        ListNode dummyHead = head;
        ListNode dummyTail = dummyHead;
        dummyHead.next = null; // detach dummyHead from prv list

        for(int i=1; i < arr.size(); i++){

            ListNode prv = arr.get(i-1);
            ListNode curr = arr.get(i);
            if(prv.val == curr.val) // do not include dupli in dummyList
                continue;
            else{
                curr.next = null; // detach curr form old list
                dummyTail.next = curr;
                dummyTail = curr;
            }
        }

        return dummyHead;
        
    }
}