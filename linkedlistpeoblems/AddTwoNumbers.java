package problem_solving.linkedlistpeoblems;

import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.constructLL;
import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.displayLL;

public class AddTwoNumbers {

    public static Node addTwoNumbers(Node l1,Node l2) {
        Node dummyHead=new Node(0);
        Node temp=dummyHead;
        int carry=0;



          while (l1!=null || l2!=null || carry!=0)
          {
              int  sum=carry;
             if(l1!=null)
             {
                 sum+= l1.data;
                 l1=l1.next;
             }
             if (l2!=null)
             {
                 sum+=l2.data;
                 l2=l2.next;
             }

             carry=sum/10;

             temp.next=new Node(sum%10);
             temp=temp.next;

          }

          return dummyHead.next;
    }
    public static void main(String[] args) {

        int[] arr={1,4,3};
        int[] arr2={5,6,7};
        Node head1=constructLL(arr);
        Node head2=constructLL(arr2);
        Node temp=addTwoNumbers(head1,head2);
        displayLL(temp);

    }
}
