package Recursion;

public class REcu7 {
    static boolean fun(String s,int start,int end)
    {
        if (start>=end)
            return true;
        return (s.charAt(start)==s.charAt(end) && fun(s,start+1,end-1));
    }
    public static void main(String[] args) {
        String s="aabbba";
        int l=s.length();
        System.out.println(fun(s,0,l-1));
    }
}
