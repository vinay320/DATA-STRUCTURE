package Sorting;

import java.util.Arrays;

public class QuickSort
{
     static void qsort(int[] arr,int l,int h)
     {
         if(l<h)
         {
             int p=part(arr,l,h);
             qsort(arr,l,p-1);
             qsort(arr,p+1,h); // we can also write -> l=p+1;
         }
     }
    static int part(int[] arr, int low, int high)
{
    int pivot=arr[high];
    int i=low-1;
    for (int j = low; j <high ; j++) {
        if (arr[j]<pivot)
        {
            i++;
            int tmp=arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }

    }
    int tmp=arr[i+1];
    arr[i+1]=arr[high];
    arr[high]=tmp;

    return i+1;
}
    public static void main(String[] args) {
        int[] arr=new int[]{21,3,32,5,23,45,56,15};
        qsort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
