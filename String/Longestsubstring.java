package String;

import java.util.Arrays;

public class Longestsubstring
{
    static int length(String str)
    {
        int l=str.length();
        int res=0;
        int[] arr=new int[256];
        Arrays.fill(arr,-1);
        int i = 0;
        for (int j = 0; j <l ; j++) {
            i=Math.max(i,arr[str.charAt(j)]+1);
            int maxend=j-i+1;
            res=Math.max(res,maxend);
            arr[str.charAt(j)]=j;

        }
        return res;
    }
    public static void main(String[] args) {
        String str="abcdabc";
        System.out.println(length(str));
    }
}
