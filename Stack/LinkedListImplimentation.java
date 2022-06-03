package Stack;

class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}

public class LinkedListImplimentation
{
    Node head;
    int size;
    LinkedListImplimentation()
    {
        head=null;
        size=0;
    }
    int size()
    {
        return size;
    }
    boolean isempty()
    {
        return head==null;
    }
    void  push(int x)
    {
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        size++;
    }
    void pop()
    {
        if (head==null)
        {
            System.out.println("Empty");
        }
        else {
            int res = head.data;
            head = head.next;
            size--;
            System.out.println(res);
        }
    }
    int peek()
    {
        if (head==null)
        {
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        LinkedListImplimentation l=new LinkedListImplimentation();
        l.push(45);
        l.push(78);
        l.push(41);
        l.pop();
        l.pop();
        l.pop();
        l.pop();
        System.out.println( l.peek());



    }

}
