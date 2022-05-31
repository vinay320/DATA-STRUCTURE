package Searching;

public class BinarySearch {
    static int search(int[] arr,int key)
    {
        int start=0;
        int last=arr.length;
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
    public static void main(String[] args) {
        int[] arr=new int[]{10,45,56,58,75,84,95};
        int key=10;
        System.out.println(search(arr,key));
    }
}
