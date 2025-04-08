package problem_solving.linkedlistpeoblems;

import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.constructLL;

public class SearchInLL {

    static boolean searchKey(int n, Node head, int key) {

       Node temp=head;
       int i=0;
       boolean isFound=false;
       while(temp!=null && i!=n)
       {
           if(temp.data==key)
           {
               isFound=true;
           }
           temp=temp.next;
          i++;
       }

       return isFound;
    }
    public static void main(String[] args) {

        int[] arr={12,1,23,42};

        Node head=constructLL(arr);

        System.out.println(searchKey(arr.length,head,44));


    }
}
