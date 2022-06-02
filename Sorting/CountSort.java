package Sorting;

import java.util.Arrays;

public class CountSort
{       static void count(int[] arr)
    {
        int[] count=new int[5];
        for (int i = 0; i < 5; i++) {
            count[i]=0;
        }
        for (int i = 0; i <6 ; i++) {
            count[arr[i]]++;
        }
        System.out.println(Arrays.toString(count));
        for (int i = 1; i <5; i++) {
            count[i]=count[i]+count[i-1];
        }
        System.out.println(Arrays.toString(count));
        int[] out=new int[6];
        for (int i = 5; i >=0 ; i--) {
            out[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        System.out.println(Arrays.toString(out));
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,4,4,1,0,1};
        count(arr);
    }
}
