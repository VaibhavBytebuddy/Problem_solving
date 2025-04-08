package problem_solving.linkedlistpeoblems;


import java.util.Arrays;

import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.constructLL;
import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.displayLL;

public class DeleteNodeLinkedList {

    public  static void deleteNode(Node node)
    {

        if(node==null || node.next==null)
        {
            System.out.println("Node is at last position we can not delete it");
        }

        node.data=node.next.data;
        node.next=node.next.next;

    }



    public static void main(String[] args) {
        int[] arr={12,1,23,42};


      Node node=new Node(12);

        Node head=constructLL(arr);
        displayLL(head);

        deleteNode(node);


    }
}
