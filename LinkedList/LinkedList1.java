package LinkedList;

import Array.Arraylist;

import java.util.ArrayList;

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

public class LinkedList1
{
    // Traversing a LinkedList iterative....
    static void printlist(Node head)
    {
        Node curr=head;
        while (curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    // Traversing a LinkedList Recursive....
    static void printlistR(Node head)
    {
        if (head==null)
        {
            return;
        }
        System.out.print(head.data+" ");
        printlist(head.next);
    }
    //For insert at start.........
    static Node InsertBeg(Node head,int x)
    {
        Node temp= new Node(x);
        temp.next=head;
        return temp;
    }
    //For insert at End...........
    static void InsertEnd(Node head,int x)
    {
        Node temp=new Node(x);
        temp.next=null;
        Node curr=head;
        while (curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=temp;

    }
    // delete first node...
    static Node deleteFirst(Node head)
    {
        if (head==null)
            return null;
        return head.next;
    }
    // delete last node...
        static Node deleteLast(Node head)
        {
            if (head==null)
                return null;
            if (head.next==null)
                return null;
            Node curr=head;
            while (curr.next.next!=null)
            {
                curr=curr.next;
            }
            curr.next=null;
            return head;
        }

        //Insert at given position....
    static Node InsPos(Node head,int pos,int x)
    {
        if (pos==1)
        {
            InsertBeg(head,x);
        }
        Node temp=new Node(x);
        Node curr=head;
        for (int i = 1; i <pos-2 ; i++) {
            curr=curr.next;
        }
        if (curr==null)
            return head;
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    // Search an element
    static int search1(Node head,int x)
    {   int pos=0;
        Node curr=head;
        while (curr!=null)
        {   pos++;
            if (x==curr.data)
            {
                return pos;
            }
            curr=curr.next;
        }
        return -1;
    }
    static int search2(Node head,int x) {
        if (head == null)
            return -1;
        if (head.data == x)
            return 1;
        else {
            int res = search2(head.next, x); // Recursive call..
            if (res == -1)
                return -1;
            else
            {
                return res+1;
            }
        }
    }
    // Reverse LinkedList
    static Node Rev(Node head)
    {
        ArrayList<Integer> a=new ArrayList<>();
        for (Node curr = head; curr!=null; curr=curr.next) {
            a.add(curr.data);
        }
        for (Node curr = head; curr!=null; curr=curr.next) {
            curr.data=a.remove(a.size()-1);
        }
        return head;
        /*
        Node curr=head;
        Node prev=null;
        while (curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
        */

    }
    // Rrecursive reverse
    static Node Rev1(Node head)
    {
        if (head==null || head.next==null)
            return head;
        Node rst=Rev1(head.next);
        Node tail=head.next;
        tail.next=head;
        head.next=null;
        return rst;
    }

    // Remove duplicate
    static Node Rduplicate(Node head)
    {
        Node curr=head;
        while (curr.next!=null && curr!=null)
        {
            if (curr.data==curr.next.data)
            {
                curr.next=curr.next.next;
            }
            else
            {
                curr=curr.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(20);
        head.next=temp1;
        temp1.next=temp2;
        System.out.println("Iterative traversal");
        printlist(head);
        System.out.println("\nRecursive traversal");
        printlistR(head);
        System.out.println("\nFor insert at start");
        head=InsertBeg(head,10);
        printlist(head);
        System.out.println("\nFor insert at End");
        InsertEnd(head,20);
        printlist(head);
        System.out.println("\nDelete First node");
        head=deleteFirst(head);
        printlist(head);
        System.out.println("\nDelete Last Node");
        head=deleteLast(head);
        printlist(head);
        System.out.println("\nInsert at given Postition");
        head=InsPos(head,2,10);
        printlist(head);
        System.out.println("\nSearching 20 iterative");
        System.out.println(search1(head,20));
        System.out.println("searcing 20 Recursive");
        System.out.println(search2(head,20));
        System.out.println("\nReverse");
        head=Rev(head);
        printlist(head);
        System.out.println("\nReverse recursive");
        head=Rev1(head);
        printlist(head);
        System.out.println("\nFor insert at End");
        InsertEnd(head,30);
        printlist(head);
        System.out.println("\nRemove Duplicate");
        head=Rduplicate(head);
        printlist(head);
    }
}
