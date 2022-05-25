package Recursion;
// Josephus problem
public class REcu12 {
    static int fun(int n,int k)
    {
        if (n==1) {
            return 0;
        }
        else
            return (fun(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        System.out.println(fun(7,3));
    }
}
