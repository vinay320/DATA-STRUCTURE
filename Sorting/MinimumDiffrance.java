package Sorting;

public class MinimumDiffrance
{
    static int NegPostive(int[] arr, int low, int high)
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

        // for minimum diffrance....
        int res=Integer.MAX_VALUE;
        for (int j = 1; j <arr.length-1 ; j++) {
            res=Math.min(res,arr[i]-arr[i-1]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{-12,18,-10,15,-8};
        System.out.println(NegPostive(arr,0,arr.length-1));

    }
}
