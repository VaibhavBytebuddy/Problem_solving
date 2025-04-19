package problem_solving.linkedlistpeoblems;

import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.constructLL;
import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.displayLL;

public class RemoveElementFromEnd {
    public static Node removeNthFromEnd(Node head, int n) {

        if (head == null) return null;

        // Step 1: Reverse the list
        Node reversed = reverseLL(head);

        // Step 2: Remove the Nth node from the start of reversed list
        if (n == 1) {
            // Remove the head node in reversed list
            reversed = reversed.next;
        } else {
            Node temp = reversed;
            int i = 1;
            while (temp != null && i < n - 1) {
                temp = temp.next;
                i++;
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
            }
        }

        // Step 3: Reverse the list again to get the original order
        return reverseLL(reversed);
    }

    public static Node reverseLL(Node head)
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
        Node temp=removeNthFromEnd(head,3);
        displayLL(temp);

    }
}
