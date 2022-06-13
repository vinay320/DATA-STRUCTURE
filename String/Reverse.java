package String;

public class Reverse
{
    static void reverse(char[] s)
    {
        int start=0;
        for (int end = 0; end < s.length; end++) {
            if (s[end]==' ')
            {
                reverse1(s,start,end-1);
                start=end+1;
            }
        }
        reverse1(s,start,s.length-1);
        reverse1(s,0,s.length-1);

       String s1=new String(s);
        System.out.println(s1);

    }
    static void reverse1(char[] s,int low,int high)
    {
        while (low<high)
        {
            char tmp=s[low];
            s[low]=s[high];
            s[high]=tmp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        String s="I hate coding";
        System.out.println("before");
        System.out.println(s);
        System.out.println("After");
        reverse(s.toCharArray());
    }
}
