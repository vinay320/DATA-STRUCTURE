package String;

public class LeftMostNonRepeting
{
    static int check(String s)
    {
        int[] c1=new int[256];
        for (int i = 0; i <s.length() ; i++) {
            c1[s.charAt(i)]++;
        }
        int index=-1;
        for (int i = 0; i <s.length() ; i++) {
            if(c1[s.charAt(i)]==1)
            {
                return i;
            }

        }
        return index;
    }
    public static void main(String[] args) {
        String s="anagram";
        System.out.println(check(s));

    }
}
