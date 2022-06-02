package Sorting;

import java.util.Arrays;

public class LomutoPartition
{
    static void part(int[] arr,int low,int high)
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

    }
    public static void main(String[] args) {
        int[] arr=new int[]{21,3,32,5,23,45,56,15,2};
        part(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
