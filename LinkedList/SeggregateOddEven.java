package LinkedList;
class Node3
{
    int data;
    Node3 next;
    Node3(int x)
    {
        data=x;
        next=null;
    }
}

public class SeggregateOddEven
{

    static void printlist(Node3 head) {
    Node3 curr = head;
    while (curr != null) {
        System.out.print(curr.data + " ");
        curr = curr.next;
    }
    //Seggregate odd even
}
    static Node3 method(Node3 head)
    {
        Node3 es=null,os=null,el=null,ol=null;
        for (Node3 curr1=head;curr1!=null;curr1=curr1.next)
        {
            int x=curr1.data;
            if (x%2==0)
            {
                if (es==null)
                {
                    es=curr1;
                    el=es;
                }
                else
                {
                    el.next=curr1;
                    el=el.next;
                }
            }
            else
            {
                if (os==null)
                {
                    os=curr1;
                    ol=os;
                }
                else
                {
                    ol.next=curr1;
                    ol=ol.next;
                }
            }
        }
        if (os==null || es==null)
            return head;
        el.next=os;
        ol.next=null;
        return es;

    }
    public static void main(String[] args) {
        Node3 head=new Node3(4);
        Node3 t1=new Node3(14);
        Node3 t2=new Node3(43);
        Node3 t3=new Node3(5);
        Node3 t4=new Node3(54);
        Node3 t5=new Node3(24);
        head.next=t1;
        t1.next=t2;
        t2.next=t3;
        t3.next=t4;
        t4.next=t5;
        System.out.println("Iterative traversal");
        printlist(head);
        head=method(head);
        System.out.println("\nSeggregated odd even");
    printlist(head);
    }
}
