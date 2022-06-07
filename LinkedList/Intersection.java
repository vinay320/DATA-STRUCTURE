package LinkedList;
class Node4
{
    int data;
    Node4 next;
    Node4 (int x)
    {
        data=x;
        next=null;
    }
}
public class Intersection
{
    static int nodecount(Node4 head) {
        int c=0;
        Node4 curr = head;
        while (curr != null) {
            curr = curr.next;
            c++;
        }
        return c;
    }
    static void printlist(Node4 head) {
        int c=0;
        Node4 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    // intersection
    static void method(Node4 head1, Node4 head2)
    {
        Node4 curr1=head1,curr2=head2;
        int c1=nodecount(head1);
        int c2=nodecount(head2);
        // let consider c1 is greater
        for (int i = 0; i <c1-c2; i++) {
            curr1=curr1.next;
        }
        while (curr1!=null && curr2!=null)
        {
            if(curr1.data==curr2.data)
            {
                System.out.println(curr2.data);
                break;
            }
            else
            {
                curr2=curr2.next;
                curr1=curr1.next;
            }
        }

    }
    public static void main(String[] args) {
        Node4 head1=new Node4(4);
        Node4 t1=new Node4(14);
        Node4 head2=new Node4(43);
        Node4 t3=new Node4(5);
        Node4 t4=new Node4(54);
        Node4 t5=new Node4(24);
        head1.next=t1;
        t1.next=t3;
        head2.next=t3;
        t3.next=t4;
        t4.next=t5;
        System.out.println("\nIterative traversal");
        printlist(head1);
        System.out.println("\nIterative traversal");
        printlist(head2);
        System.out.println("\nIntersection node is");
        method(head1,head2);
    }
}
