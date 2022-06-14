package Queue;
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
public class QueueByLinkedList
{
    Node front,rear;
    QueueByLinkedList()
    {
        front=rear=null;
    }
    void enque(int x)
    {
        Node tmp=new Node(x);
        if (front==null)
        {
            front=rear=tmp;
            return;
        }
        rear.next=tmp;
        rear=tmp;
    }
    void deque()
    {
        if(front==null)
            return;
        front=front.next;
        if(front==null)
            rear=null;
    }
    void traverse(Node front)
    {
        Node curr=front;
        while (curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        QueueByLinkedList q=new QueueByLinkedList();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.deque();
        q.deque();
        q.enque(4);
        q.enque(5);
        q.enque(1);
        q.traverse(q.front);


    }
}
