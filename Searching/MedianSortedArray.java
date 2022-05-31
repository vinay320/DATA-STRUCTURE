package Searching;
// Consider a1 has small size then a2....
public class MedianSortedArray
{
    static double getmid(int[] a1,int[] a2)
    {
        int n1=a1.length;
        int n2=a2.length;
        int start=0;
        int last=n1;
        while (start<=last)
        {
            int i1=(start+last)/2;
            int i2=(n1+n2+1)/2-i1;
            int min1=(i1==n1)?Integer.MAX_VALUE:a1[i1];
            int max1=(i1==0)?Integer.MIN_VALUE:a1[i1-1];
            int min2=(i1==n2)?Integer.MAX_VALUE:a2[i2];
            int max2=(i1==0)?Integer.MIN_VALUE:a2[i2-1];
            if (max1<=min2 && max2<=min1)
            {
                if ((n1+n2)%2==0)
                {
                    return ((double) Math.max(max1,max2)+Math.min(min1,min2))/2;
                }
                else
                {
                    return Math.max(max1,max2);
                }
            }
            else if (max1>max2)
            {
                last=i1-1;
            }
            else
            {
                start=i1+1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a1=new int[]{1,2,3,4,5};
        int[] a2=new int[]{10,20,30,40,50,60,70};
        System.out.println(getmid(a1,a2));

    }
}
