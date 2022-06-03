package Stack;

import java.util.ArrayDeque;


public class StackCollection
{
    public static void main(String[] args) {
       // Stack<Integer> s=new Stack<>();
        ArrayDeque<Integer> s=new ArrayDeque<>();
        s.push(10);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
