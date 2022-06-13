package String;

public class PatternSearch
{
    static void check(String s,String p)
    {
        int ls=s.length();
        int lp=p.length();
        for (int i = 0; i <ls-p.length() +1; i++)
        {
           // String x=s.substring(i,lp+i);
         if(s.substring(i,lp+i).equals(p))
         {
             System.out.println(i);
         }
        }
    }
    public static void main(String[] args) {
        String s="aaaa";
        String p="a";
        check(s,p);
    }
}
