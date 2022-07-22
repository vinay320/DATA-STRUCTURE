package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Bnode2
{
    int key;
    Bnode2 left,right;
    Bnode2(int k)
    {
        key=k;
    }
}

public class LevelOrderTraversal
{
    //Level order traversal
    static void printl(Bnode2 root)
    {
        if (root==null)
            return;
       Queue<Bnode2> q= new LinkedList<>();
        q.add(root);
        while (!q.isEmpty())
        {
            Bnode2 curr=q.poll();
            System.out.print(curr.key+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if (curr.right!=null)
                q.add(curr.right);
        }


    }

    //Level order traversal line bye line
    static void printline(Bnode2 root)
    {
        if(root==null)
            return;
        Queue<Bnode2> q1=new LinkedList<>();
        q1.add(root);
        q1.add(null);
        while (q1.size()>1)
        {
            Bnode2 curr=q1.poll();
            if(curr==null) {
                System.out.println();
                q1.add(null);
                continue;
            }
            System.out.print(curr.key+" ");
            if (curr.left!=null)
            {
                q1.add(curr.left);
            }
            if (curr.right!=null)
            {
                q1.add(curr.right);
            }

        }
    }
    // Level order traversal line bye line
    static void printline1(Bnode2 root)
    {
        if (root==null)
            return;
        Queue<Bnode2> q2=new LinkedList<>();
        q2.add(root);
        while (!q2.isEmpty())
        {
            int c= q2.size();
            for (int i = 0; i <c ; i++) {
                Bnode2 curr= q2.poll();
                System.out.print(curr.key+" ");
                if (curr.left!=null)
                {
                    q2.add(curr.left);
                }
                if (curr.right!=null)
                {
                    q2.add(curr.right);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Bnode2 root=new Bnode2(10);
        root.left=new Bnode2(20);
        root.right=new Bnode2(30);
        root.left.left=new Bnode2(40);
        root.left.right=new Bnode2(50);
        root.right.left=new Bnode2(60);
        printl(root);
        System.out.println("\n line by line");
        printline(root);
        System.out.println("\n line by line");
        printline1(root);

    }
}
