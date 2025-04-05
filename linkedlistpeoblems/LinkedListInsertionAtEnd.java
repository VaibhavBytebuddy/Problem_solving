package problem_solving.linkedlistpeoblems;

import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.constructLL;
import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.displayLL;

public class LinkedListInsertionAtEnd {
    static Node insertAtEnd(Node head, int x) {
       Node temp=head;
        Node newnode=new Node(x);
       if(head==null)
       {
           head=temp=newnode;
       }
        while(temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next=newnode;
        temp=newnode;

        return head;
    }

    public static void main(String[] args) {
        //int[] arr={12,1,23,42};
        int[] arr={};


        Node head=constructLL(arr);
        displayLL(head);
        head=insertAtEnd(head,8);
        displayLL(head);

    }
}
