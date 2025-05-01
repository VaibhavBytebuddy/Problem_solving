package problem_solving.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementQueueusingStacks {
    Queue<Integer> s;
    public ImplementQueueusingStacks() {
        s=new LinkedList<>();
    }

    public void push(int x) {
         s.add(x);
    }

    public int pop() {
      return s.poll();
    }

    public int peek() {
        return s.peek();
    }

    public boolean empty() {
     return s.isEmpty();
    }
    public static void main(String[] args) {
        ImplementStackUsingQueue stack=new ImplementStackUsingQueue();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
