package LinkedList;

class Node1
{
    int data;
    Node1 next;
    Node1(int x)
    {
        data=x;
        next=null;
    }
}

public class SortedInsert
    {
        static void printlist(Node1 head)
        {
            Node1 curr=head;
            while (curr!=null)
            {
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
        }
        static Node1 SortInsert(Node1 head,int x)
        {
            Node1 tmp=new Node1(x);
            if (head==null)
            {
                head=tmp;
                return head;
            }
            if (x< head.data)
            {
                tmp.next=head;
                head=tmp;
                return head;
            }
            Node1 curr=head;
            while (curr.next!=null && curr.next.data<x)
            {
                curr=curr.next;
            }
            tmp.next=curr.next;
            curr.next=tmp;
            return head;
        }
        public static void main(String[] args) {
        Node1 head = new Node1(10);
        Node1 temp1 = new Node1(15);
        Node1 temp2 = new Node1(20);
        head.next = temp1;
        temp1.next = temp2;
        System.out.println("Iterative traversal");
        printlist(head);
        System.out.println("\nsorted Insert");
        head=SortInsert(head,12);
        printlist(head);
    }
}
