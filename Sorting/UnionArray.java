package Sorting;

public class UnionArray
{
    static void union(int[] arr,int[] ar1)
    {
        int i=0,j=0;
        while (i<arr.length && j<ar1.length)
        {
            if (arr[i]<ar1[j])
            {
                System.out.println(arr[i]);
                i++;
            }
            else if(arr[i]>ar1[j])
            {
                System.out.println(ar1[j]);
                j++;
            }
            else
            {
                System.out.println(ar1[j]+" ");
                i++;
                j++;
            }
        }
        while (i<arr.length)
        {
            if (arr[i]!=arr[i-1])
            {
                System.out.println(arr[i]);
                i++;
            }
        }
        while (j<ar1.length)
        {
            if (ar1[j]!=ar1[j-1])
            {
                System.out.println(ar1[j]);
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        int[] ar1=new int[]{1,4,5,6};
        union(arr,ar1);
    }
}
