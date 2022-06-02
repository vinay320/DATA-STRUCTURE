package Sorting;

import java.util.Arrays;

public class BubbleSort
{
    static void Bubble(int[] arr)
    {
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i; j <arr.length-i-1; j++) {
                if(arr[i]>=arr[j])
                {
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args)
    {
     int[] arr=new int[]{10,4,78,55,744};
        Bubble(arr);

    }

}
