package String;

public class LeftMostRepeteing
{
    static int check(String s)
    {
        int[] c1=new int[256];
        for (int i = 0; i <s.length() ; i++) {
            c1[s.charAt(i)]++;
        }
        int index=-1;
        for (int i = 0; i <256 ; i++) {
            if(c1[i]>1)
            {
                index = Math.max(index,i);
            }

        }
        return s.indexOf(index);
    }
    public static void main(String[] args) {
        String s="Kashmirfiles";
        System.out.println(check(s));

    }
}
