package problem_solving.linkedlistpeoblems;

import java.util.Arrays;

import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.constructLL;

public class CountLinkedListNodes {

    public static int getCount(Node head)
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {

        int[] arr={12,1,23,42};

        Node head=constructLL(arr);
        System.out.println(getCount(head));

    }
}
