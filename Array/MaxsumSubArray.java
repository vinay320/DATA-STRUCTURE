package Array;

public class MaxsumSubArray
{
    static int sum(int[] arr)
    {
        int n=arr.length;
        int res=arr[0];
        for (int i = 0; i <n ; i++) {
            int c=0;
            for (int j = i; j < n; j++) {
                c=c+arr[j];
                res=Math.max(res,c);
            }
        }
        return res;
    }
    static int MaxSum(int[] arr)
    {
        int n=arr.length;
        int res=arr[0];
        int Max=arr[0];
        for (int i = 1; i <n ; i++) {
            Max=Math.max(Max+arr[i],arr[i]);
            res=Math.max(res,Max);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,-2,3,-1,2};
        System.out.println(sum(arr));
        System.out.println("2nd Way");
        System.out.println(MaxSum(arr));
    }
}
