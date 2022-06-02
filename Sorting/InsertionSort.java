package Sorting;

import java.util.Arrays;

public class InsertionSort
{
    static void Insert(int[] arr)
    {
        for (int i = 1; i <arr.length ; i++) {
            int x = arr[i];
            int y = i - 1;
            while (y >= 0 && arr[y] > x)
            {
                arr[y+1]=arr[y];
                y--;
            }
            arr[y+1]=x;
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{10,4,78,55,744};
        Insert(arr);
    }
}
