package problem_solving.linkedlistpeoblems;

import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.constructLL;
import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.displayLL;

public class CheckPalindrom {
    public static boolean isPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        Node right=reverseHalfLL();
        Node left=head;

        while (right!=null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }

    public static Node getMiddle(Node head)
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
    public static Node reverseHalfLL()
    {
        Node midNode=getMiddle(head);
        Node prev=null;
        Node curr=midNode;
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        return prev;
    }

   static Node head;

    public static void main(String[] args) {
        int[] arr={1,2,2,1};
         head=constructLL(arr);
        displayLL(head);
        System.out.println("Is list is palindrom ? "+isPalindrome(head));

    }

}
