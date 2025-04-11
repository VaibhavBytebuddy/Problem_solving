package problem_solving.doublyLL;

import static problem_solving.doublyLL.DoublyLL.constructDLL;
import static problem_solving.doublyLL.DoublyLL.displayDLL;

public class DeleteNode {
    public static DNode deleteNode(DNode head, int x) {

        int i=1;
        DNode temp=head;
        DNode t2=new DNode();
        DNode t3=new DNode();

        if(x==1)
        {
            head=temp.next;
            temp.next=null;
            head.prev=null;
            return head;
        }


        while(temp!=null && i<x-1)
        {
            temp=temp.next;
            i++;

        }
        t2=temp.next;

        //for last element
        if(t2.next==null)
        {
           temp.next=null;
           t2.prev=null;
           return head;
        }

        t3=t2.next;
        //middle element
        temp.next=t3;
        t3.prev=temp;
        t2.next =null;
        t2.prev=null;







        return head;
    }

    public static void main(String[] args) {

        int[] arr={2,4,5,6};
        DNode head=constructDLL(arr);
        displayDLL(head);
        head=deleteNode(head,4);
        displayDLL(head);




    }
}
