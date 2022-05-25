package Recursion;
//Permutations of character
public class REcu14 {
    static void fun(char[] s,int i)
    {
        if (i==s.length-1)
        {
            System.out.println(String.valueOf(s));
            return;
        }
        for (int j = i; j <s.length ; j++) {
            swap(s,i,j);
            fun(s,i+1);
            swap(s,i,j);
        }
    }
    static void swap(char[] s,int i,int j)
    {
        char te=s[i];
        s[i]=s[j];
        s[j]=te;
    }
    public static void main(String[] args) {
        fun("ABC".toCharArray(),0);
    }
}
