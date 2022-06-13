package String;

public class CheckRotation
{
    public static void main(String[] args) {
        String s1="ABAB";
        String s2="BABA";
        int i=((s1+s1).indexOf(s2));
        if (i>=0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
