package Queue;

public class QueueArrayImplimentation
{
    int size,cap;
    int [] arr;
    QueueArrayImplimentation(int c)
    {
        cap=c;
        size=0;
        arr=new int[c];
    }
    void enque(int x)
    {
        if (isfull())
        {
            return;
        }
        arr[size++]=x;
    }
    void deque()
    {
        if (isempty())
        {
            return;
        }
        for (int i = 0; i <size-1 ; i++) {
            arr[i]=arr[i+1];
        }
        size--;
    }
    int getFront()
    {
        if (isempty()) {
            return -1;
        }
            else return arr[0];
    }
    int getRear()
    {
        if(isempty())
        {
            return -1;
        }
        else
            return arr[size-1];
    }
    boolean isfull()
    {
        return (size==cap);
    }
    boolean isempty()
    {
        return (size==0);
    }
    void traverse()
    {
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
     QueueArrayImplimentation queue=new QueueArrayImplimentation(5);
     queue.enque(24);
     queue.enque(34);
     queue.enque(44);
     queue.traverse();
        System.out.println();
        System.out.println("Front :"+queue.getFront());
        System.out.println("Rear :"+queue.getRear());
     queue.deque();
     System.out.println();
     queue.traverse();



    }
}
