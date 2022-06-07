package LinkedList;

class NodeD
{
    int data;
    NodeD next;
    NodeD prev;
    NodeD(int x)
    {
        data=x;
        next=prev=null;
    }
}
public class DoublyLinkedList
{
    //Traversal..
    static void traverse(NodeD head)
    {
        NodeD temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    // Insert At Beginning
    static NodeD InsertB(NodeD head,int x)
    {
        NodeD temp=new NodeD(x);
        temp.next=head;
        if (head!=null)
        {
            head.prev=temp;
        }
        return head;
    }

    // Insert at End
    static NodeD InsertE(NodeD head,int x)
    {
        NodeD tmp=new NodeD(x);
        if (head==null)
            return tmp;
        NodeD curr=head;
        while (curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=tmp;
        tmp.prev=curr;
        return head;
    }


    // Reverse Doubly LinkedList
    static NodeD reverse(NodeD head)
    {
        if (head==null || head.next==null)
        {
            return head;
        }
        NodeD prev=null;
        NodeD next=null;
        NodeD curr=head;
        while (curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }

       return prev;
    }

    // Delete first Node
    static NodeD DeleteF(NodeD head)
    {
        if (head==null)
            return head;
        if (head.next==null)
            return null;
        head=head.next;
        head.prev=null;
        return head;
    }

    // Delete Last Node
    static NodeD DeleteL(NodeD head)
    {
        if (head==null)
        {
            return head;
        }
        if (head.next==null)
        {
            return null;
        }
        NodeD curr=head;
        while (curr.next!=null)
        {
         curr=curr.next;
        }
        curr.prev.next=null;
        return head;

    }
    public static void main(String[] args) {


        NodeD head = new NodeD(10);
        NodeD temp1 = new NodeD(20);
        NodeD temp2 = new NodeD(30);
        head.next=temp1;
        temp1.next=temp2;
        temp1.prev=head;
        temp2.prev=temp1;
        traverse(head);
        System.out.println("\nInsert At Beginning");
        head=InsertB(head,5);
        traverse(head);
        System.out.println("\nInsert at End");
        head=InsertE(head,40);
        traverse(head);
        System.out.println("\nrevesrse");
        head=reverse(head);
        traverse(head);
        System.out.println("\nDelete first node");
        head=DeleteF(head);
        traverse(head);
        System.out.println("\nLast Node deleted");
        head=DeleteL(head);
        traverse(head);
    }
}
