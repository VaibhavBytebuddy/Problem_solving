package problem_solving.linkedlistpeoblems;



import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.constructLL;
import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.displayLL;

public class DeleteMiddleNode {
    public static Node deleteMiddle(Node head) {
        if(head.next==null)
        {
            return null;
        }
        Node temp=head;
        Node fast=temp;
        Node slow=temp;
        Node temp2=null;
        while(fast!=null && fast.next!=null)
        {   temp2=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp2.next=slow.next;
        slow.next=null;

        return temp;


    }

    public static void main(String[] args) {
       // int[] arr={1,3,4,7,1,2,6};
       // int[] arr={1,2,3,4};
        int[] arr={2,1};

        Node head=constructLL(arr);
        displayLL(head);
        Node d=deleteMiddle(head);
        displayLL(d);
    }
}
