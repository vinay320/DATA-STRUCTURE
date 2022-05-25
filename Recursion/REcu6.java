package Recursion;
// sum of n natural no
public class REcu6 {
    static int fun(int n,int k)
    {
        if (n==0)
            return k;
        return fun(n-1,k+n);
    }
    public static void main(String[] args) {
        System.out.println(fun(10,0));
    }
}
