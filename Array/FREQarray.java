package Array;

import java.util.Arrays;

public class FREQarray {
    static void freq(int[] arr)
    {   int c=1;
        int i=1;
        Arrays.sort(arr);
        int n=arr.length;
        while (i<n)
        {
            while (i<n && arr[i]==arr[i-1])
            {
                c++;
                i++;
            }
            System.out.println(" "+arr[i-1]+" "+c);
            i++;
            c=1;
        }
        if (n==1 || arr[n-1]!=arr[n-2])
        {
            System.out.println(arr[n-1]+" "+1);
        }

    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,1,1,3,4,3,32,2,32,2};
        freq(arr);
    }
}
