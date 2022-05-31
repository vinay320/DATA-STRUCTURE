package Searching;

import java.util.Scanner;

public class CountNoOf1s
{
    static int search(int[] arr,int key)
    {
        int s=0;
        int l=arr.length-1;
        int mid;
        while (s<=l)
        {   mid=(l+s)/2;
            if(arr[mid]>key)
            {
                l=mid-1;
            }
            else if(arr[mid]<key)
            {
                s=mid+1;
            }
            else
            {
                if(mid==0 || arr[mid-1]!=arr[mid])
                {
                    return mid;
                }
                else
                {
                    l=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{0,0,0,1,1,1,1,1};
        Scanner sc=new Scanner(System.in);
        int s=search(arr,1);
        System.out.println(arr.length-s);
    }
}
