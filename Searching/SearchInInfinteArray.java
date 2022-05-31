package Searching;

public class SearchInInfinteArray {
    static int BinarySearch(int[] arr,int key,int a,int b)
    {
        int start=a;
        int last=b;
        int mid;
        while (start<=last)
        {
            mid=(start+last)/2;
            if(arr[mid]!=key)
            {
                if(arr[mid]>key)
                {
                    last=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    static int search(int[] arr,int x)
    {
        if (arr[0]==x) {
            return 0;
        }
        int i=1;
        while (arr[i]<x)
        {
            i=i*2;
        }
        if (arr[i]==x)
        {
            return i;
        }
        return BinarySearch(arr,x,(i/2)+1,i-1);
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};// consider array has infinite size..
        System.out.println(search(arr,5));

    }
}
