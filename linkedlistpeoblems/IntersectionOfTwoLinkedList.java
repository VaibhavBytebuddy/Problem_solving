package problem_solving.linkedlistpeoblems;

import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.constructLL;
import static problem_solving.linkedlistpeoblems.ArrayToLinkedList.displayLL;

public class IntersectionOfTwoLinkedList {
    public static int lenCount(Node head) {
        Node temp = head;
        int count=0;
        while (temp != null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    


    public static Node getIntersectionNode(Node headA, Node headB) {
        int lenA=lenCount(headA);
        int lenB=lenCount(headB);

        Node currA=headA;
        Node currB=headB;

        // Move the pointer of longer list ahead
        if (lenA>lenB)
        {
            int diff=lenA-lenB;
            while (diff-- >0)
            {
                currA=currA.next;
            }
        }
        else {
            int diff=lenB-lenA;
            while (diff-- >0)
            {
                currB=currB.next;
            }
        }

        //Traverse both lists together
        while (currA !=null && currB !=null)
        {
            if (currA==currB)
            {
                return currA;
            }
            currA=currA.next;
            currB=currB.next;
        }

        return null;







    }
    public static void main(String[] args) {
//        int[] arr={4,1,8,4,5};
//        int[] arr2={5,6,1,8,4,5};
        int[] arr={1,9,1,2,4};
        int[] arr2={3,2,4};


        Node headA=constructLL(arr);
        Node headB=constructLL(arr2);
        displayLL(headA);
        displayLL(headB);

//        System.out.println("lenghth of List 1 is  "+lenCount(headA));
//        System.out.println("lenghth of List 2 is  "+lenCount(headB));
        Node intersectionNode = getIntersectionNode(headA, headB);
        System.out.println(intersectionNode.data);

    }
}
