package problem_solving.linkedlistpeoblems;

import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.constructLL;
import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.displayLL;

public class ReturnMiddleNode {

    public static Node middleNode(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public static void main(String[] args) {
        //int[] arr={1,3,25,2,5,1,5};
        int[] arr={1,2,3,4,5,6};


       Node head=constructLL(arr);
       displayLL(head);

       Node test=middleNode(head);
        System.out.println(test.data);
    }
}
