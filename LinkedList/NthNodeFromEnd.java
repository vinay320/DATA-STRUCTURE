package LinkedList;

class Node2
{
    int data;
    Node2 next;
    Node2(int x)
    {
        data=x;
        next=null;
    }
}
public class NthNodeFromEnd
{
    static void printlist(Node2 head)
{
    Node2 curr=head;
    while (curr!=null)
    {
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
}
// Ntn node from end
    static void print1(Node2 head,int n)
    {   // using length
        /*
        int l=0;
        Node2 curr=head;
        while (curr!=null)
        {l++;
         curr=curr.next;
        }
        Node2 curr1=head;
        for (int i = 1; i <l-n+1 ; i++) {
            curr1=curr1.next;
        }
        System.out.println(curr1.data);
        */
        //using two pointer approch
        if (head==null)
            return;
        Node2 first=head;
        for (int i = 0; i <n ; i++) {
            if (first==null)
                return;
            first=first.next;
        }
        Node2 second=head;
        while (first!=null)
        {
            second= second.next;
            first=first.next;
        }
        System.out.println(second.data);
    }
    public static void main(String[] args) {
        Node2 head = new Node2(10);
        Node2 temp1 = new Node2(15);
        Node2 temp2 = new Node2(20);
        Node2 temp3 = new Node2(30);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next=temp3;
        System.out.println("Iterative traversal");
        printlist(head);
        System.out.println("\nNth node from end 3");
        print1(head,3);

    }
}
