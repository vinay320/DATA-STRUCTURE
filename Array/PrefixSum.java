package Array;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr=new int[]{1,8,30,5,20,7};
        int[] sum=new int[arr.length];
        sum[0]=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            sum[i]=sum[i-1]+arr[i];
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("enter start");
        int s=sc.nextInt();
        System.out.println("Enter lst");
        int l=sc.nextInt();
        if(s==0)
        {
            System.out.println(sum[l]);
        }
        else
        {
            System.out.println(sum[l]-sum[s-1]);
        }
    }
}
