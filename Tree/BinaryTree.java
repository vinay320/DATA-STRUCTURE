package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Bnode
{
    int key;
    Bnode left,right;
    Bnode(int k)
    {
        key=k;
    }
}

public class BinaryTree
{

    //Traverse Binay tree
// 1.inorder
    static void inorder(Bnode root)
    {
        if (root==null)
            return;
        inorder(root.left);
        System.out.print(" "+root.key+" ");
        inorder(root.right);
    }
//    2.preorder
    static void preorder(Bnode root)
    {
        if (root==null)
            return;
        System.out.print(" "+root.key+" ");
        preorder(root.left);
        preorder(root.right);
    }
    // 3.postorder
    static void postorder(Bnode root)
    {
        if (root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(" "+root.key+" ");
    }

//    Height of binary tree
    static int height(Bnode root)
    {
        if (root==null)
            return 0;
        else
            return Math.max(height(root.left),height(root.right))+1;
    }
    // Size of binary tree
    static int Size(Bnode root)
    {
        if (root==null)
            return 0;
        else
            return 1+Size(root.left)+Size(root.right);
    }
    // Maximum value in binary tree
    static int max(Bnode root)
    {
        if (root==null)
            return Integer.MIN_VALUE;
        else
            return Math.max(root.key,Math.max(max(root.right),max(root.left)));
    }

    //left view of Binary Tree
   static int maxl=0;
    static void LeftView(Bnode root,int level)
    {
        if (root==null)
            return;
        if (maxl<level)
        {
            System.out.print(root.key+" ");
            maxl=level;
        }
        LeftView(root.left,level+1);
        LeftView(root.right,level+1);
    }

    //children sum property lc + rc =node value
    static boolean csum(Bnode root)
    {
        if(root==null)
            return true;
        if (root.left==null && root.right==null)
            return true;
        int sum=0;
        if(root.left!=null)
        {
            sum+=root.left.key;
        }
        if(root.right!=null)
        {
            sum+=root.right.key;
        }
        return (root.key==sum && csum(root.right) && csum(root.left));


    }

    //check height balanced
    static boolean heightB(Bnode root)
    {
     if (root==null)
         return true;
     int lh=height(root.left);
     int rh=height(root.right);
     return (Math.abs(lh-rh)<=1 && heightB(root.left) && heightB(root.right));
    }
    // check height balanced 2 method
    static int heightB2(Bnode root)
    {
        if (root==null)
            return 0;
        int lh=heightB2(root.left);
        if(lh==-1)
            return -1;
        int rh=heightB2(root.right);
        if(rh==-1)
            return -1;
        if(Math.abs(lh-rh)>1)
            return -1;
        else
            return Math.max(lh,rh)+1;
    }

    // max width or max no of node at any level
    static int Width(Bnode root)
    {
        if (root==null)
            return 0;
        Queue<Bnode> q=new LinkedList<>();
        q.add(root);
        int res=0;
        while (q.isEmpty()==false)
        {
            int count=q.size();
            res=Math.max(res,count);
            for (int i = 0; i <count ; i++)
            {
             Bnode curr=q.poll();
             if(curr.left!=null)
             {
                 q.add(curr.left);
             }
             if (curr.right!=null)
             {
                 q.add(curr.right);
             }
            }
        }
        return res;
    }
    //conevert into doubly linked list DLL
   static Bnode prev=null;
    static Bnode DLl(Bnode root)
    {
        if(root==null)
            return root;
        Bnode head=DLl(root.left);
        if(prev==null)
        {
            head=root;
        }
        else
        {
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        DLl(root.right);
        return head;
    }

// consturct b tree using in and pre...
    static int preindex=0;
    static Bnode Tree(int[] in,int[] pre,int is,int ie)
    {
        if (is>ie)
        {
            return null;
        }
        Bnode root=new Bnode(pre[preindex++]);
        int inindex = 0;
        for (int i=is;i<=ie;i++)
        {
            if(in[i]==root.key)
            {
                inindex=i;
                break;
            }
        }
        root.left=Tree(in,pre,is,inindex-1);
        root.right=Tree(in,pre,inindex+1,ie);
        return root;
    }


    public static void main(String[] args) {
        Bnode root=new Bnode(20);
        root.left=new Bnode(8);
        root.right=new Bnode(12);
        root.left.left=new Bnode(8);
        root.left.right=new Bnode(5);
        System.out.println("Inorder ");
        inorder(root);
        System.out.println("\nPreorder ");
        preorder(root);
        System.out.println("\nPostorder ");
        postorder(root);
        System.out.println("\nHeight of tree");
        System.out.println(height(root));
        System.out.println("size of btree");
        System.out.println(Size(root));
        System.out.println("Max element");
        System.out.println(max(root));
        System.out.println("Left View");
        LeftView(root,1);
        System.out.println();
        System.out.println("childern sum property");
        System.out.println(csum(root));
        System.out.println("Balanced or not");
        System.out.println(heightB(root));
        System.out.println("Balanced or not");
        int aa=heightB2(root);
        if(aa>=0)
        {
            System.out.println("Balanced");
        }

        System.out.println("width of b tree");
        System.out.println(Width(root));
        Bnode head=DLl(root);

        while (head!=null)
        {
            System.out.print(head.key+" ");
            head=head.right;
        }
        System.out.println();
        Bnode root1=Tree(new int[]{20,10,40,30,50},new int[]{10,20,30,40,50},0,4);
        preorder(root1);


    }
}
