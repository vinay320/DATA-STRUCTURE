package Recursion;

public class REcu4 {
    static int fun(int n,int k)
    {
        if (n==0 || n==1)
            return k;
        else
            return fun(n-1 ,n*k);
    }
    public static void main(String[] args) {
        System.out.println(fun(4,1));
    }
}
