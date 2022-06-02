package Sorting;

import java.util.Arrays;

public class CycleSort
{
    static void cycle(int[] arr)
    {
        for (int i = 0; i <arr.length-1 ; i++) {
            int item=arr[i];
            int pos=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]<item)
                {
                    pos++;
                }
            }
            int tmp=item;
            item=arr[pos];
            arr[pos]=tmp;
            while (pos!=i)
            {
                pos=i;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j]<item)
                    {
                        pos++;
                    }
                }
                tmp=item;
                item=arr[pos];
                arr[pos]=tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr=new int[]{20,40,50,10,30};
        cycle(arr);

    }
}
