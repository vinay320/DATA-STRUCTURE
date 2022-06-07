package LinkedList;

class NodeC
{
    int data;
    NodeC next;
    NodeC(int x)
    {
        data=x;
        next=null;
    }
}

public class CirculerLinkedList
{
    //Traversal
    static void traverse(NodeC head)
    {
        if (head==null)
            return;

        System.out.print(head.data+" ");
        NodeC curr=head.next;
        while (curr!=head)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    // Insert At Beginning
    static NodeC insertB(NodeC head,int x)
    {
        NodeC tmep=new NodeC(x);
        if (head==null)
        {  tmep.next=tmep;
            return tmep;
        }

        else {
            //tmep.next=head;
            NodeC curr = head;
            while (curr.next != head) {
                curr=curr.next;
            }
            curr.next=tmep;
            tmep.next=head;
            head=tmep;
        }
        return head;
    }
    // Insert at End
    static NodeC insertE(NodeC head,int x)
    {
        NodeC tmp=new NodeC(x);
        if (head==null)
        {
            tmp.next=tmp;
            return tmp;
        }
        else
        {
            NodeC curr=head;
            while (curr.next!=head)
            {
                curr=curr.next;
            }
            curr.next=tmp;
            tmp.next=head;
            return head;
        }
    }
    static NodeC deleteFirst(NodeC head)
    {
        /*
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
        */

        if (head==null)
            return null;
        if (head.next==head)
            return null;
        NodeC curr=head;
        while (curr.next!=head)
        {
            curr=curr.next;
        }
        curr.next=head.next;
        head=curr.next;
        return head;

    }

    //delete nth node
    static NodeC deleteN(NodeC head,int n)
    {
        if (head==null)
            return head;
        if (n==1)
            deleteFirst(head);
        NodeC curr=head;
        for (int i = 0; i <n-2 ; i++)
        {
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
    public static void main(String[] args) {
        NodeC head=new NodeC(10);
        NodeC temp1=new NodeC(20);
        NodeC temp2=new NodeC(30);
        NodeC temp3=new NodeC(40);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        temp3.next=head;
        traverse(head);
        System.out.println("\nInsert at beginning");
        head=insertB(head,5);
        traverse(head);
        System.out.println("\nInserr at End");
        head=insertE(head,50);
        traverse(head);
        System.out.println("\nDelete First node");
        head=deleteFirst(head);
        traverse(head);
        System.out.println("\nDelete nth Node");
        head=deleteN(head,3);
        traverse(head);
    }
}
