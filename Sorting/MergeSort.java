package Sorting;


import java.util.Arrays;

public class MergeSort
{
    static void mergesort(int[] arr,int l,int r)
    {
        if(r>l)
        {
            int m=(l+r)/2;
            mergesort(arr,l,m);
            mergesort(arr,m+1,r);
            merge(arr,l,m,r);

        }
    }
    static void merge(int[] arr,int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for (int i = 0; i < n1; i++)
        {
            left[i]=arr[i+l];
        }
        for (int i = 0; i <n2 ; i++)
        {
            right[i]=arr[m+i+1];
        }
        int i=0,j=0,k=l;
        while (i<n1 && j<n2)
        {
            if (left[i] <= right[j])
            {
                arr[k]=left[i];
                i++;
            }
            else
            {
              arr[k]=right[j];
                j++;

            }
            k++;
        }

        while (i<n1)
    {
        arr[k]=left[i];
        i++;
        k++;
    }
        while (j<n2)
    {
        arr[k]=right[j];
        j++;
        k++;
    }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        int[] ar1=new int[]{1,30,40,60};
        int[] arr2=new int[]{10,5,30,15,7};
        int i=0;
        int j=0;
        while (i<arr.length && j<ar1.length)
        {
            if(arr[i]<ar1[j])
            {
                System.out.println(arr[i]);
                i++;
            }
            else
            {
                System.out.println(ar1[j]);
                j++;
            }
        }
        while (i<arr.length)
        {
            System.out.println(arr[i]);
            i++;
        }
        while (j<ar1.length)
        {
            System.out.println(ar1[j]);
            j++;
        }


        System.out.println("Second Way Using Alogrithm");
        mergesort(arr2,0,arr2.length-1);
        System.out.println(Arrays.toString(arr2));
    }
}
