/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        //To handle spcial cases
        if(head == null || k == 0){
            return head;
        }

        //Calculate the length of the linked list and adjust k
        int length = 1;
        Node tail = head;
        while(tail.next != null){
            length++;
            tail = tail.next;
        }
        k = k%length;

        //If k is zero after adjustment,no rotation is needed
        if(k == 0){
            return head;
        }
        //find the new head and new tail positions
        int breakPos =  length - k - 1;
        Node newTail = head;
        for(int i=0;i<breakPos;i++){
            newTail = newTail.next;
        }

        //Perform the rotation
        Node newHead = newTail.next;
        newTail.next = null;
        tail.next = head;
        return newHead;
    }
}
