package LinkedList;

 // App-3 (in java)
 class Solution {

    ListNode leftTemp; // in cpp we used to pass 'leftTemp' with reference but in java we do not have that operator so we will declare leftTemp as a global variable and using this keyword we will change it

    public boolean isPalinRec(ListNode head, ListNode leftTemp){
        
        if(head == null)
            return true;
        
        boolean isPalin = isPalinRec(head.next, this.leftTemp);

        System.out.println("leftnode : " + this.leftTemp.val);

        if(!isPalin) // is its not palin, return false, dont compare further
            return false;
        else{ // else, compare and check curr nodes
            if(head.val != this.leftTemp.val)
                isPalin = false; // if found not palin, dont compare futher
            else isPalin = true;

            this.leftTemp = this.leftTemp.next;// updating the leftNdoe (static)
            return isPalin;
        }
    }

    public boolean isPalindrome(ListNode head) {

        this.leftTemp = head; // trying to change the static leftTemp (shared)
        boolean isPalin = isPalinRec(head, this.leftTemp);

        return isPalin;
    }
}