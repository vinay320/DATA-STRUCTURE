package LinkedList;
class Node22
{
    int data;
    Node22 next;
    Node22(int x)
    {
        data=x;
        next=null;
    }
}

public class DeleteNodeWith1Pointre
{
    static void printlist(Node22 head)
    {
        Node22 curr=head;
        while (curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    //delete node with one pointer
   static void delete(Node22 ptr)
    {
        ptr.data=ptr.next.data;
        ptr.next=ptr.next.next;
    }
    public static void main(String[] args) {
        Node22 head=new Node22(10);
        Node22 temp1=new Node22(20);
        Node22 temp2=new Node22(30);
        head.next=temp1;
        temp1.next=temp2;
        System.out.println("\nIterative traversal");
        printlist(head);
        delete(temp1);
        System.out.println("\nIterative traversal");
        printlist(head);
    }
}
