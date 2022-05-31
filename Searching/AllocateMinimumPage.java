package Searching;

public class AllocateMinimumPage
{
    static int minpages(int[] arr,int k)
    {
        int sum=0;
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            max=Math.max(max,arr[i]);
        }
        int low=max;
        int high=sum;
        int res=0;
        while (low<=high)
        {
            int mid=(low+high)/2;
            if ((fes(arr,arr.length,k,mid)))
            {
                res=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return res;
    }
    static boolean fes(int[] arr, int n,int k,int ans)
    {
        int req=1;
        int sum=0;
        for (int i = 0; i <n ; i++) {
            if(sum+arr[i]>ans)
            {
                req++;
                sum=arr[i];
            }
            else
            {
                sum+=arr[i];
            }
        }
        return (req<=k);
    }
    public static void main(String[] args)
    {
        int[] arr=new int[]{10,5,20};
        System.out.println(minpages(arr,2));
    }
}
