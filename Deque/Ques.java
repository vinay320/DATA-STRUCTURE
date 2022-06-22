package Deque;

import java.util.Deque;
import java.util.LinkedList;


public class Ques
{
   static Deque<Integer> deq=new LinkedList<Integer>();


   static void insertFirst(int x)
    {
        deq.addFirst(x);
    }
   static void insertLast(int x)
    {
        deq.addLast(x);
    }
    static int getmin()
    {
        return deq.peekFirst();
    }
    static int getmax()
    {
        return deq.peekLast();
    }
    static int extractFirst()
    {
        return deq.pollFirst();
    }
    static int extractLast()
    {
        return deq.pollLast();
    }
    public static void main(String[] args) {
        insertFirst(15);
        insertLast(19);
        insertLast(20);
        insertFirst(12);
        insertFirst(10);
        System.out.println("Max "+getmax());
        System.out.println("Min "+getmin());
        System.out.println("Min out "+extractFirst());
        System.out.println("Max out "+extractLast());


    }
}
