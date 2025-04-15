package problem_solving.linkedlistpeoblems;

public class DetectCycle {
    public boolean hasCycle(Node head) {

        if(head==null)
        {
            return false;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null )
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }


        return false;
    }
    public static void main(String[] args) {

    }
}
