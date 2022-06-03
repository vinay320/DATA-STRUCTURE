package Stack;

import java.util.Stack;

public class StockSpan
{
    static void span1(int[] arr)
    {
        for (int i = 0; i <arr.length ; i++) {
            int sp=1;
            for (int j =i-1; j>=0 && arr[j]<=arr[i]; j--) {
                sp++;

            }
            System.out.print(sp+" ");
        }
    }
    static void method2(int[] arr)
    {
        Stack<Integer> s=new Stack<>();
        s.push(0);
       System.out.print("1 ");
        for (int i = 1; i <arr.length ; i++) {
            while (!s.empty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            int span=s.empty()?i+1:i-s.peek();
            System.out.print(span+" ");
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{23,4,3,25,2,30};
        span1(arr);
        System.out.println("Method 2");
        method2(arr);

    }
}
