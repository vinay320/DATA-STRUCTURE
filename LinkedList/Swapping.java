package LinkedList;

import java.util.Stack;

class Node5
{
    char data;
    Node5 next;
    Node5(char x)
    {
        data=x;
        next=null;
    }
}
public class Swapping
{
    static void printlist(Node5 head) {
        Node5 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    //swapping
    static Node5 swap(Node5 head)
    {
        if (head==null || head.next==null)
            return head;
        Node5 curr=head.next.next; // curr <= 43
        Node5 prev=head;  // prev <= 4
        head=head.next; // head <= 14
        head.next=prev; // 14 -> 4
        while (curr!=null && curr.next!=null)
        {
            prev.next=curr.next;    //1.// 4-> 5
            prev=curr;              //1.// 5-> 5
            Node5 neww=curr.next.next; //.1//  neww -> 54
            curr.next.next=curr; //  43
            curr=neww;  // curr -> 54
        }
        prev.next=curr;
        return head;
    }

    // palindrome
    static boolean pal(Node5 head)
    {
        Node5 slow=head;
        Node5 fast=head;
        while (fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
       // System.out.println(slow.data);

        Stack<Character> s=new Stack<>();
        while (slow!=null)
        {
            s.push(slow.data);
            slow=slow.next;
        }
        int l=s.size();
        Node5 curr=head;
        while (l>0)
        {
            if(s.pop()!=curr.data)
            {
                return false;
            }
            curr=curr.next;
            l--;
        }
        return true;
    }
        public static void main(String[] args){
            Node5 head = new Node5('A');
            Node5 t1 = new Node5('B');
            Node5 t2 = new Node5('C');
            Node5 t3 = new Node5('C');
            Node5 t4 = new Node5('B');
            Node5 t5 = new Node5('D');
            head.next = t1;
            t1.next = t2;
            t2.next = t3;
            t3.next = t4;
            t4.next = t5;
            System.out.println("Iterative traversal");
            printlist(head);
            System.out.println("\n ");
            head=swap(head);
            printlist(head);
            System.out.println("\n");
            System.out.println(pal(head));
        }
}
