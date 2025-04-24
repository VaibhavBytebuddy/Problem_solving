package problem_solving.linkedlistpeoblems;

import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.constructLL;
import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.displayLL;

public class SortLL {
    public static  Node sortList(Node head) {
        for (Node i=head;i!=null;i=i.next)
        {
            for(Node j=head;j.next!=null;j=j.next)
            {
             if(j.data>j.next.data)
             {
                 Node temp=new Node();
                 temp.data=j.next.data;
                 j.next.data=j.data;
                 j.data=temp.data;

             }
            }
        }
        return head;
    }


    public static void main(String[] args) {
        int[] arr={12,1,23,42};


        Node head=constructLL(arr);
        displayLL(head);

      Node  sorthead=sortList(head);
      displayLL(sorthead);
    }
}
