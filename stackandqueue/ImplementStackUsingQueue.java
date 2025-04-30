package problem_solving.stackandqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    Queue<Integer> q;
    public ImplementStackUsingQueue()
    {
         q=new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);

        //this will rotate queue and , store elements in LIFO
        for (int i = 1; i <q.size() ; i++) {
            q.add(q.poll());
        }


    }

    public int pop() {
      return q.poll();
    }

    public int top() {
      return q.peek();
    }

    public boolean empty() {

        return q.isEmpty();
    }
    public static void main(String[] args) {
        ImplementStackUsingQueue stack=new ImplementStackUsingQueue();
        System.out.println();
        System.out.println(stack.empty());
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("/////////////////////////////////peek");
        System.out.println(stack.top());
        System.out.println(stack.empty());



        System.out.println("/////////////////////////////////pop");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());

    }
}
