```java
class takeInputAsArrayPrintLL{


    // class for a linked list node
    public static class node{
        int data;
        node next;
        node(int data){
            this.next = null;
            this.data = data;
        }
    } 

    public static node insertAtTail(node tail, int value){ // since in java obj are passed by reference but whever we try to change them in a method then a new copy is created, so that means that we can not modify 'tail' here, so insert the node at end of the tail and then return this new node so that we can make it tail inside the main method 
        tail.next = new node(value); 
        return tail.next;
    }

    public static void printLinkedList(node head){
        node temp = head;
        while(temp != null){
            if(temp.next == null)
                System.out.print(temp.data);
            else System.out.print(temp.data + " -> ");

            temp = temp.next;
        }


    }

    // public static printLL(node head){

    // }

    public static void main(String args[]){

        node head = new node(-1);
        node tail;

        head = new node(-1); // head and tail
        tail = head;

        tail = insertAtTail(tail, 0);   
        tail = insertAtTail(tail, 1);
        tail = insertAtTail(tail, 2);
        tail = insertAtTail(tail, 3);        
        tail = insertAtTail(tail, 4);

        printLinkedList(head);

        // -1 -> 0 -> 1 -> 2 -> 3 -> 4
    }
}

```
