package String;

public class Anagram
{
    static boolean check1(String s1,String s2)
    {
        if(s1.length()!=s2.length())
            return false;
        int[] c=new int[256];
        for (int i = 0; i < s1.length(); i++) {
            c[s1.charAt(i)]++;
            c[s2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if(c[i]!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="meshra";
        String s2="ramesh";
        System.out.println(check1(s1,s2));
    }
}
