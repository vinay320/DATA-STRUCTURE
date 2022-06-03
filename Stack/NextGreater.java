package Stack;

import java.util.Stack;

public class NextGreater
{
    static void greater(int[] arr,int n)
    {
        Stack<Integer> s=new Stack<>();
        s.push(arr[n-1]);
        Stack<Integer> s2=new Stack<>();
        for (int i = n-2; i>=0 ; i--) {
            while (!s.empty() && s.peek()<=arr[i])
            {
                s.pop();
            }
            int span=(s.empty())?-1:s.peek();
            s2.push(span);
            s.push(arr[i]);
        }
        int l=s2.size();
        for (int i = 0; i <l ; i++) {
            System.out.println(s2.pop());
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{23,4,3,25,2,30};
        greater(arr,arr.length);

    }
}
