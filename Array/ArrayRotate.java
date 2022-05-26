package Array;

import java.util.Scanner;

public class ArrayRotate {
    
  // Approch 1
    static void rotateR(int[] arr,int x)
    {
        int[] temp=new int[x];
        for (int i = 0; i <x ; i++) {
            temp[i]=arr[i];
        }
        for (int i = 0; i <arr.length-x ; i++) {
            arr[i]=arr[i+x];
        }
        int aa=0;
        for (int i = arr.length-x; i <arr.length; i++) {

            arr[i]=temp[aa];
            aa++;
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    // Approch 2

    static void divide(int[] arr,int d,int n)
    {
            // when d=>n
            d=d%n;
            int j,k,temp;
            int gcd=gcd(d,n);
        for (int i = 0; i <gcd ; i++) {
            temp=arr[i];
            j=i;
            while (true)
            {
                k=j+d;
                if(k>=n) {
                    k = k - n;
                }
                if(k==i) {
                    break;
                }
                arr[j]=arr[k];
                j=k;
            }
            arr[j]=temp;
        }



    }
    static void ptin(int[] arr)
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    static int gcd(int d,int n)
    {
        if(n==0)
        {
            return d;
        }
        else
            return gcd(n,d%n);
    }
            
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int[] arr1=new int[n];
        for (int i = 0; i <n ; i++) {
            arr1[i]=arr[i];
        }
        System.out.println("Enter index");
        int i=sc.nextInt();
        rotateR(arr,i);
        System.out.println("Enter d for divide");
        int d=sc.nextInt();
        divide(arr1,d,arr.length);
        ptin(arr1);
    }
}
