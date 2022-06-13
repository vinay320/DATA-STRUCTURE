package String;

public class CheckSubSequence
{   static boolean check(String s1,String s2)
{
    int i=0;
    int j=0;
    while (i<s2.length() && j<s1.length())
    {
        if(s1.charAt(j)==s2.charAt(i))
        {
            i++;
            j++;
        }
        else {
            j++;
        }
    }
    return i==s2.length();
}

// Rcursive soln
    static boolean cheack2(String s1,String s2,int i,int j) {
        /*if (i == 0)
            return false;
        if (j == 0)
            return true;
        if(s1.charAt(i-1)==s2.charAt(j-1))
        {
            return cheack2(s1,s2,i-1,j-1);
        }
        return cheack2(s1,s2,i-1,j);

         */
        if(i==s1.length() && j!=s2.length())
        {
            return false;
        }
        if (j==s2.length())
        {
            return true;
        }
        if(s1.charAt(i)==s2.charAt(j))
            return cheack2(s1,s2,i+1,j+1);
        return cheack2(s1,s2,i+1,j);
    }
    public static void main(String[] args) {
        String s1="RAMESH";
        String s2="EH";
        System.out.println(check(s1,s2));
        System.out.println("Recursive");
        System.out.println(cheack2(s1,s2,0,0));
    }
}
