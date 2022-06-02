package Sorting;
// for sorted Array
public class IntersectionArray
{
    static void Intersect(int[] arr,int[] ar1)
    {
    int i=0,j=0;
    while (i<arr.length && j<ar1.length)
    {
        if (arr[i]<ar1[j])
        {
            i++;
        }
        else if(arr[i]>ar1[j])
        {
            j++;
        }
        else
        {
            System.out.println(ar1[j++]+" ");
            i++;
        }
    }
}
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        int[] ar1=new int[]{1,4,5,6};
        Intersect(arr,ar1);
    }
}
