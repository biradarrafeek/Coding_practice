/* 

    Following is the class used to represent the Node of a Singly Linked List

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.setData(data);
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

    }
*/

public class Solution {

    public static void deleteAlternateNodes(Node<Integer> head) {
        //Your code goes here
        if(head==null || head.next==null){
            return;
        }
        Node<Integer> currentNode = head;
        while(currentNode!=null && currentNode.next!=null){
            Node<Integer> nextNode =currentNode.next;
            currentNode.next=nextNode.next;
            nextNode=null;

            currentNode = currentNode.next;
        }
    }
}
