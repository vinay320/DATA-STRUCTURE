package Array;

import java.util.Scanner;

public class OperationOnArray {

    //To search an element --------------------------->>>>>>>>>>>>>

    static int search(int[] arr,int x)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x)
            {
                return i;
            }

        }return -1;
    }
   // To insert an element ------------------>>>>>>>>>>>>>>>>>
    static void insert(int[]arr,int x,int pos)
    {
        for (int i =arr.length-1; i>pos;i--) {
            arr[i]=arr[i-1];
        }
        arr[pos]=x;
    }

    // To delete an element--->>>>>>>>>>>>>>>>>>>>>>>>>>>
    static int delete(int[] arr,int x)
    {    int i;
        for ( i= 0; i <arr.length ; i++) {
            if(arr[i]==x)
            {
                break;
            }
        }
        if (i==arr.length)
            return arr.length;
        for (int j = i; j <arr.length-1 ; j++) {
            arr[j]=arr[j+1];
        }
            return arr.length-1;
    }
    // TO find  2nd and 1st Largest ________________________>>>>>>>>>>>>>>
    static int largest(int[] arr)
    {
        int m=0;
        int m2=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>arr[m])
                m2=m;
                m=i;

        }
        return m2;
    }

        // To check Sorted ---------------------->>>>>>>>>>>>>>>>>>>>>>
        static boolean sort(int[] arr)
    {
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i+1]<arr[i])
                return false;
        }
        return true;
    }


    // To revrse and array
    static void REve(int[] arr)
    {
        int l=0;
        int h=arr.length-1;
        while (l<h)
        {
            int tmp=arr[l];
            arr[l]=arr[h];
            arr[h]=tmp;
            l++;
            h--;
        }
        prints(arr);
    }

    static void prints(int[] arr)
    {
        System.out.println("Reverse array");
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i <4; i++) {
            arr[i]=sc.nextInt();
        }

        int x=sc.nextInt();
        System.out.println(search(arr,x));
        System.out.println("Enter element to insert");
        int ele=sc.nextInt();
        System.out.println("Enter position");
        int pos=sc.nextInt();
        insert(arr,ele,pos-1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(" enter elemet to delete");
        int del=sc.nextInt();
        System.out.println(delete(arr,del));

        System.out.println("2nd Largest element");
        System.out.println(arr[largest(arr)]);

        System.out.println("Check Sorted arry");
        System.out.println(sort(arr));
            REve(arr);

    }
}
