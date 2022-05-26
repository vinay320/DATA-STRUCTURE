package Array;

import java.util.Scanner;

public class ArrayRotateALgo {

    static void rotate(int[] arr,int d)
    {
        if(d==0)
        {
            return;
        }
        d=d%arr.length;
        revArr(arr,0,d-1);  // reverse the first 0 to d elemets
        revArr(arr,d,arr.length-1);  //reverse the first d to n elemets
        revArr(arr,0,arr.length-1); // reverse all elements..
    }
    static void revArr(int[] arr,int start,int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void prn(int[] arr)
    {
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Index");
        int d=sc.nextInt();
        rotate(arr,d);
        prn(arr);
    }

}
