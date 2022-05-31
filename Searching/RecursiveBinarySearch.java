package Searching;

public class RecursiveBinarySearch
{
    static int search(int[] arr,int key,int s,int l)
    {   int mid;
        if(s>l)
        {
            return -1;
        }

            mid=(l+s)/2;
            if (arr[mid]!=key)
            {
                if (arr[mid]>key)
                {
                    return search(arr,key,s,mid-1);
                }
                else
                {
                    return search(arr,key,mid+1,l);
                }
            }
            else
            {
                return mid;
            }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{10,45,56,58,75,84,95};
        int key=56;
        System.out.println(search(arr,key,0,arr.length));
    }
}
