package problem_solving.linkedlistpeoblems;




import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.constructLL;
import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.displayLL;

public class ReverseLL {

    public static Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node next;
        while (curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }
    public static void main(String[] args) {
        int[] arr={2,4,5,6};
        Node head=constructLL(arr);
        displayLL(head);
        Node rev=reverse(head);
        displayLL(rev);
    }
}
