package Searching;

public class SortedandRotated
{
    static int Search(int[] arr,int key)
    {
        int low=0;
        int high=arr.length-1;
        while (low<=high)
        {
            int mid=(low+high)/2;
            if (arr[mid]==key)
            {
                return mid;
            }
            if (arr[mid]>arr[low])
            {
                if (key>=arr[low] && key<arr[mid])
                {
                    high=mid-1;
                    low=mid+1;
                }
            }
            else
            {
                if (key>arr[mid] && key<=arr[high])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{100,500,10,20,30,40,50};
        System.out.println(Search(arr,40));
    }
}
