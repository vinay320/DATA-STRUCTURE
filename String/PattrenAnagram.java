package String;

public class PattrenAnagram
{
    static boolean checkM(String s1,String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        for (int i = 0; i <= l1 - l2; i++)
        {
            if (checkA(s2, s1, i))
            {
                return true;
            }
        }
        return false;
    }
    static boolean checkA(String s2,String s1,int i)
    {
        int[] c=new int[256];
        for (int j = 0; j< s2.length(); j++) {
            c[s2.charAt(j)]++;
            c[s1.charAt(i+j)]--;
        }
        for (int j = 0; j< 256; j++) {
            if(c[j]!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="mississipi";
        String s2="sis";
        System.out.println(checkM(s1,s2));
    }
}
