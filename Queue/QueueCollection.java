package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueCollection
{
    //reverse of queue....
    static void rev(Queue<Integer> q)
    {
        if (q.isEmpty())
            return;
        int x=q.peek();
        q.poll();
        rev(q);
        q.add(x);
    }
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);
        System.out.println("peek :"+q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        q.add(300);
        q.add(400);
        System.out.println(q);
        rev(q);
        System.out.println("Reverse");
        System.out.println(q);

    }
}
