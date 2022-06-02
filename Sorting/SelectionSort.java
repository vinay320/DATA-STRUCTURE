package Sorting;

import java.util.Arrays;

public class SelectionSort
{
    static void Select(int[] arr)
    {
        for (int i = 0; i <arr.length ; i++) {
            int pos=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[pos]>arr[j])
                {
                    pos=j;
                }
            }
            int tmp=arr[pos];
            arr[pos]=arr[i];
            arr[i]=tmp;
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{10,4,78,55,744};
        Select(arr);
    }
}
