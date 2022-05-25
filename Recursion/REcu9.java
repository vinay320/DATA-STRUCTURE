package Recursion;
// Rope cutting problem
public class REcu9
{   static int fun(int n,int a,int b,int c)
    {
        if (n==0)
            return 0;
        if (n<0)
            return -1;
        int res=Math.max(fun(n-a,a,b,c),fun(n-b,a,b,c));
        res=Math.max(res,fun(n-c,a,b,c));
        if (res==-1)
            return -1;
        return res+1;
    }
    public static void main(String[] args) {
        System.out.println(fun(9,2,2,2));
    }
}
