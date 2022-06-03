package Stack;

import java.util.Stack;

public class PreviousGreater
{
    static void greater(int[] arr)
    {
        Stack<Integer> s=new Stack<>();
        s.push(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            while (!s.empty() && s.peek()<=arr[i])
            {
                s.pop();
            }
            int sp=(s.empty())?-1:s.peek();
            System.out.println(sp);
            s.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{23,4,3,25,2,30};
        greater(arr);
    }
}
