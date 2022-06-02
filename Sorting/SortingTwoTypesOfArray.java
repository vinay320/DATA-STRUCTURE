package Sorting;

import java.util.Arrays;

public class SortingTwoTypesOfArray
{
    // to sort array with neg and postive elements..
    // -12,18,-10,15,-8
    static void NegPostive(int[] arr,int low,int high)
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

    // Sorting Array of 0,1,2
    // Dutch National Flag Algo...
    static void Method(int[] arr)
    {
        int l=0;
        int h=arr.length-1;
        int mid=0;
        while (mid<=h)
        {
            if (arr[mid]==0)
            {
                int tmp=arr[l];
                arr[l]=arr[mid];
                arr[mid]=tmp;
                l++;
                mid++;
            }
            else if (arr[mid]==1)
            {
                mid++;
            }
            else
            {
                int tmp=arr[mid];
                arr[mid]=arr[h];
                arr[h]=tmp;
                h--;
            }
        }
    }
    // Partition around a range
    public static void main(String[] args) {
     int[] arr=new int[]{-12,18,-10,15,-8};
     NegPostive(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        int[] arr1=new int[]{0,1,1,0,2,0,2,1,2,2};
        Method(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
