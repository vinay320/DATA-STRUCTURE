package Stack;

public class TwoStacksInArray
{
    int[] arr;
    int top1;
    int top2;
    TwoStacksInArray(int x)
    {
        arr=new int[x];
        top1=-1;
        top2=x;
    }
    void push1(int x)
    {
        if (top1<top2-1)
        {
            top1++;
            arr[top1]=x;
        }
        else
        {
            System.out.println("Full");
            System.exit(0);
        }
    }
    void push2(int x)
    {
        if (top1<top2-1)
        {
            top2--;
            arr[top2]=x;
        }
        else
        {
            System.out.println("Full");
            System.exit(0);
        }
    }

    int pop1()
    {
        if (top1>=0)
        {
            int res=arr[top1];
            top1--;
            return res;
        }
        else
        {
            System.out.println("Empty");
            System.exit(0);
        }
        return 0;
    }

    int pop2()
    {
        if (top2 <arr.length)
        {
            int res=arr[top2];
            top2++;
            return res;
        }
        else
        {
            System.out.println("Empty");
            System.exit(0);
        }
        return 0;
    }

    public static void main(String[] args) {
        TwoStacksInArray s=new TwoStacksInArray(5);
        s.push1(5);
        s.push2(10);
        s.push2(15);
        s.push1(11);
        s.push2(7);
        System.out.println(s.pop1());
        s.push2(40);
        System.out.println(s.pop2());
    }
}
