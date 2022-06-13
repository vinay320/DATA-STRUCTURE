package String;

public class LexiographicRank
{
    static int rank(String s)
    {
        int res=1;
        int l=s.length();
        int fact=fun(l);
        int[] c=new int[256];
        for (int i = 0; i <l; i++) {
            c[s.charAt(i)]++;
        }
        for (int i =1; i <256; i++) {
            c[i]+=c[i-1];
        }
        for (int i = 0; i <l-1 ; i++) {
            fact=fact/(l-i);
            res=res+c[s.charAt(i)-1]*fact;
            for (int j = s.charAt(i); j <256 ; j++) {
                c[j]--;
            }
        }
        return res;
    }
    static int fun(int n)
    {
        if(n==0 || n==1)
            return 1;
        return n*fun(n-1);
    }
    public static void main(String[] args) {
        String s ="BAC";
        System.out.println(rank(s));

    }
}
