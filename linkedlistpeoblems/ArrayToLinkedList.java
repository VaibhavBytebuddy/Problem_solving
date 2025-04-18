package problem_solving.linkedlistpeoblems;

import java.util.Arrays;
import java.util.stream.IntStream;

class Node
{
    int data;
    Node next;

    
    public Node() {
        this.data = 0;
    }

    public Node(int data) {
        this.data = data;
    }
}

public class ArrayToLinkedList {

    static Node constructLL(int[] arr)
    {
        Node head=new Node();
        Node temp=new Node();
        for(int data:arr)
        {
            Node newnode=new Node(data);
            if (head.data==0)
            {
                head=temp=newnode;

            }else
            {
               temp.next=newnode;
              temp=newnode;
            }
        }
       return head;
    }

    public static void displayLL(Node head)
    {
        for(Node temp=head;temp!=null;temp=temp.next)
        {
            System.out.print(temp.data+"--->");
        }
        System.out.println("-->null");

    }

    public static void main(String[] args) {
        int[] arr={12,1,23,42};


        Node head=constructLL(arr);
        displayLL(head);
    }
}
