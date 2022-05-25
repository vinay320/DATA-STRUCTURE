package Recursion;
// Tower of hanoi
public class REcu11 {
    static void fun(int n,char A,char B,char C)
    {
        if (n==1)
        {
            System.out.println("move 1 from "+A+" to "+C);
            return;
        }
        fun(n-1,A,C,B);
        System.out.println("move "+n+" from "+A+" to "+C);
        fun(n-1,B,A,C);
    }
    public static void main(String[] args) {
        fun(4,'A','B','C');
    }
}
