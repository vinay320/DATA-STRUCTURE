package Tree;
class Bnode1
{
    int key;
    Bnode1 left,right;
    Bnode1(int k)
    {
        key=k;
    }
}


public class Kthnode
{
    //kth node from root node
    static void kth(Bnode1 root,int k)
    {
        if (root==null)
        {
            return;
        }
        if(k==0)
        {
            System.out.print(root.key + " ");
        }
        else {
            kth(root.left, k - 1);
            kth(root.right, k - 1);
        }
    }
    public static void main(String[] args) {
        Bnode1 root=new Bnode1(10);
        root.left=new Bnode1(20);
        root.right=new Bnode1(30);
        root.left.left=new Bnode1(40);
        root.left.right=new Bnode1(50);
        kth(root,2);
    }
}
