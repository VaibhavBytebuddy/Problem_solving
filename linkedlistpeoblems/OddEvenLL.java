package problem_solving.linkedlistpeoblems;

import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.constructLL;
import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.displayLL;

public class OddEvenLL {
    public static Node createOddEvenList(Node head) {


        Node temp=head;
        Node evenList=new Node();
        Node oddList=new Node();
        Node oddTemp=new Node();
        Node evenTemp=new Node();

        int i=1;
        while(temp!=null)
        {
            Node newnode=new Node();
            if(i%2==0)
            {

                  newnode.data=temp.data;
                 if(evenList.data==0)
                  {
                         evenList=evenTemp=newnode;
                  }
                 else
                  {
                         evenTemp.next=newnode;
                         evenTemp=newnode;
                  }
            }
            else
            {

                newnode.data=temp.data;
                if (oddList.data==0)
                {
                    oddList=oddTemp=newnode;
                }
                else
                {
                    oddTemp.next=newnode;
                    oddTemp=newnode;
                }
            }
            temp=temp.next;
            i++;
        }
        Node t=oddList;
        while(t!=null && t.next!=null)
        {
            t=t.next;
        }
        if (t != null) {
            t.next = evenList;
        }
       return  oddList;
    }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        Node head=constructLL(arr);
        displayLL(head);
        Node newList=createOddEvenList(head);
        displayLL(newList);




    }
}
