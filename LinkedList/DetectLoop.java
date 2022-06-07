package LinkedList;
class Node11
{
    int data;
    Node11 next;
    Node11(int x)
    {
        data=x;
        next=null;
    }
}
public class DetectLoop
{
    static boolean detect(Node11 head)
    {   Node11 tmp=new Node11(head.data);

        Node11 curr=head;
        while (curr!=null)
        {
            if (curr.next==null)
                return false;
            if (curr.next==tmp)
                return true;
            Node11 currN=curr.next;
            curr.next=tmp;
            curr=currN;
        }
            return false;
    }

    //Floyed in cycle
    static boolean floyed(Node11 head)
    {   int c=1;
        Node11 slow=head;
        Node11 fast=head;
        while (fast!=null && fast.next!=null &&slow!=null)
        {
            slow=slow.next;
            fast= fast.next.next;
            c++;
            if (slow==fast)
            {
                System.out.println("Length of linkedlist :"+c);
                return true;
            }
        }

        return false;
    }

    //Remove loop
    static void RemoveLoop(Node11 head)
    {
        Node11 slow=head;
        Node11 fast=head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if(slow!=fast)
        {
            return;
        }
        slow=head;
        while (slow.next!=fast.next)
        {
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
    public static void main(String[] args) {
        Node11 head = new Node11(10);
        Node11 temp1 = new Node11(15);
        Node11 temp2 = new Node11(20);
        Node11 temp3 = new Node11(30);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next=temp3;
        temp3.next=temp1;
        System.out.println("By Floyed method");
        System.out.println(floyed(head));
        System.out.println("Normal method");
        System.out.println(detect(head));
        RemoveLoop(head);
        System.out.println(detect(head));

    }
}
