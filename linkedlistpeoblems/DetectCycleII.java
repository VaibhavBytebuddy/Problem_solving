package problem_solving.linkedlistpeoblems;

public class DetectCycleII {
    public Node detectCycle(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                Node entry=head;
                while(entry!=slow)
                {
                    slow=slow.next;
                    entry=entry.next;
                }
                return entry;
            }
        }
        return null;

    }

    public static void main(String[] args) {

    }
}
