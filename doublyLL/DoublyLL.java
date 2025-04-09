package problem_solving.doublyLL;


import DeepDiveJava.day1Map.D;

class DNode
{
    int data;
    DNode next;
    DNode prev;
    DNode()
    {
     this.data=0;
    }
    DNode(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }

}
public class DoublyLL {
     public static DNode  constructDLL(int arr[]) {

         DNode temp=new DNode();
         DNode head=new DNode();
         for (int data:arr)
         {
             DNode newnode=new DNode(data);
             if(head.data==0)
             {
                 head=temp=newnode;
             }
             else
             {
                 temp.next=newnode;
                 newnode.prev=temp;
                 temp=newnode;
             }
         }
         return head;

    }

    public static void displayDLL(DNode head)
    {
        DNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" <----> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
         int[] arr={1,2,3,4,5};
         DNode head=constructDLL(arr);
         displayDLL(head);

    }
}
