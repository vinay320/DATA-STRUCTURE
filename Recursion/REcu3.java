package Recursion;
//decimal to Binary
// n to 1 print
// 1 to n print
public class REcu3
{       static void fun(int n)
{
    if (n==0)
    {
        return;
    }
    else
    {
        fun(n/2);
        System.out.print(" "+n%2+" ");
    }
}
static void fun2(int n)
{
    if (n==0)
        return;
    System.out.print(" "+n+" ");
    fun2(n - 1);
}
    static void fun3(int n)
{
    if (n==0)
        return;

    fun3(n - 1);
    System.out.print(" "+n+" ");
}
    public static void main(String[] args) {
        System.out.println("decimal to binary");
        fun(13);
        System.out.println();
        System.out.println("------------>    N to 1");
        fun2(5);
        System.out.println();
        System.out.println("------------>    1 to n");
        fun3(5);



    }
}
