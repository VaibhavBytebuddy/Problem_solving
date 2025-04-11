package problem_solving.doublyLL;

import DeepDiveJava.day1Map.D;

import java.util.Optional;

import static problem_solving.doublyLL.DoublyLL.constructDLL;
import static problem_solving.doublyLL.DoublyLL.displayDLL;

public class InsertElement {

    public static DNode addNode(DNode head, int p, int x) {


        DNode temp=head;
        DNode newnode=new DNode(x);
        if(p==0)
        {
            newnode.next=head;
            if(head!=null)
            {
                head.prev=newnode;
                return newnode;
            }
        }
        int i=0;
        while(temp!=null && i<p)
        {
            temp=temp.next;
            i++;
        }
        if(temp==null)
        {
            return head;
        }
        newnode.prev=temp;
        newnode.next=temp.next;
        if(temp.next!=null)
        {
            temp.next.prev=newnode;
        }
        temp.next=newnode;



        return head;
    }

    public static void main(String[] args) {

        int[] arr={2,4,5};
        DNode head=constructDLL(arr);
        displayDLL(head);
        DNode test=new DNode();
        test=addNode(head,2,10);
        displayDLL(test);

    }
}
