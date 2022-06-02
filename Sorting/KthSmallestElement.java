package Sorting;

public class KthSmallestElement
{
    static int kth(int[] arr,int n,int k)
    {
        int left=0;
        int right=n-1;
        while (left<=right)
        {
            int p=part(arr,left,right);
            if (p==k-1)
            {
                return p;
            }
            else  if (p>k-1)
            {
                right=p-1;
            }
            else
            {
                left=p+1;
            }
        }
        return k;
    }
    static int part(int[] arr, int low, int high)
    {
        int pivot=arr[high];
        int i=low-1;
        for (int j = low; j <high ; j++) {
            if (arr[j]<pivot)
            {
                i++;
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }

        }
        int tmp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=tmp;

        return i+1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{21,3,32,5,23,45,56,15};
        System.out.println(arr[kth(arr,arr.length,5)]);
    }
}
