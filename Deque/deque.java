package Deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class deque
{
    public static void main(String[] args) {
       Deque<Integer> deque=new LinkedList<>();
       deque.add(10);
       deque.add(20);
       deque.add(30);
       deque.add(40);
       deque.add(50);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println("Traverse");
        Iterator it=deque.descendingIterator();
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
        }


    }
}