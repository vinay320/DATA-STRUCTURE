package Stack;

public class ArrayImplimentation
{
    int[] arr;
    int cap;
    int top;
    ArrayImplimentation(int c)
    {
        top=-1;
        cap=c;
        arr=new int[cap];
    }

    void push(int x) {
        if (isfull()) {
            System.out.println("Full");
        } else {
            top++;
            arr[top] = x;
        }
    }
    boolean isfull()
    {
        if (top==(cap-1))
        {

            return true;
        }
        return false;
    }
    int pop()
    {
        if (top==-1)
        {
            System.out.println("Stack empty");
            return -1;
        }
        int res=arr[top];
        top--;
        return res;
    }
    int size()
    {
        return top+1;
    }
    boolean empty()
    {
        if (top==-1)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
     ArrayImplimentation s=new ArrayImplimentation(5);
     s.push(10);
     s.push(12);
     s.push(14);
     s.push(45);
     s.push(78);
     s.push(47);

        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.empty());

    }
}
