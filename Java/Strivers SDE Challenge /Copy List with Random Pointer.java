import java.io.*;
import java.util.* ;

/*************************************************************

    Following is the LinkedListNode class structure

    class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    LinkedListNode<T> random;

	    public LinkedListNode(T data) {
		    this.data = data;
	    }
    }

*************************************************************/

public class Solution {
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		// Write your code here.
		if(head == null){
			return null;
		}

		//Step 1 : Duplicate each node and insert it between the original nodes
		LinkedListNode<Integer> current = head;
		while(current!=null){
			LinkedListNode<Integer> copy = new LinkedListNode<>(current.data);
			copy.next = current.next;
			current.next = copy;
			current = copy.next;
		}

		//Step 2: Set random pointers for the copied node
		current = head;
		while(current!=null){
			if(current.random!=null){
				current.next.random = current.random.next;
			}
			current = current.next.next;
		}

		//Step 3 : Separate the original list and the copied list
		LinkedListNode<Integer> newHead = head.next;
		current = head;
		while(current != null){
			LinkedListNode<Integer> copy = current.next;
			current.next = copy.next;
			if(copy.next!=null){
				copy.next = copy.next.next;
			}
			current = current.next;
		}
		return newHead;
	}
}
