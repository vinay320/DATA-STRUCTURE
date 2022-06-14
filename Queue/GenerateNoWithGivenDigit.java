package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateNoWithGivenDigit
{
   static Queue<Integer> q=new LinkedList<>();
    static void printno(int n)
    {
        q.add(5);
        q.add(6);
        int x;
        for (int i = 0; i <n ; i++)
        {
             x=q.peek();
            String curr=String.valueOf(x);
            System.out.print(q.poll()+" ");
         q.add(Integer.parseInt(curr+"5"));
         q.add(Integer.parseInt(curr+"6"));

        }
    }

    public static void main(String[] args) {
        printno(20);

    }
}
