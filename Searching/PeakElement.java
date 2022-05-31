package Searching;

public class PeakElement {
    static int mid(int[]arr,int n)
    {
        int low=0;
        int high=n-1;
        while (low<=high)
        {
            int mid=(low+high)/2;
            if ((mid==0 || arr[mid-1]<=arr[mid]) && ( mid==(n-1) || arr[mid+1] <= arr[mid]))
            {
                return mid;
            }
            if (mid>0 && arr[mid-1]>=arr[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{5,10,20,15,17,10};
        for (int i = 1; i <arr.length-1 ; i++) {
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
            {
                System.out.println(arr[i]);
            }
        }

        System.out.println("2nd Solution");
        System.out.println(arr[mid(arr,arr.length)]);

    }
}
