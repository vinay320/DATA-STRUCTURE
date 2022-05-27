package Array;

public class CirculerArray
{
    static int sum(int[] arr)
    {
        int n=arr.length;
        int res=arr[0];
        for (int i = 0; i <n ; i++) {
            int csum=arr[i];
            int cmax=arr[i];
            for (int j = 1; j <n; j++) {
                int ind=(i+j)%n;
                csum+=arr[ind];
                cmax=Math.max(csum,cmax);
            }
            res=Math.max(res,cmax);
        }
        return res;
    }
    static int sum1(int[] arr)
    {
        int n=arr.length;
        int res=arr[0];
        int mxed=arr[0];
        for (int i = 1; i <n ; i++) {
            mxed=Math.max(arr[i],mxed+arr[i]);
            res=Math.max(res,mxed);
        }
        return res;
    }
    static int oversum(int[] arr)
    {
        int maxNor=sum1(arr);
        if (maxNor<0)
        {
            return maxNor;
        }
        int arrsum=0;
        for (int i = 0; i <arr.length ; i++) {
            arrsum+=arr[i];
            arr[i]=-arr[i];
        }
        int mxc=arrsum+sum1(arr);
        return Math.max(maxNor,mxc);
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,-2,3,-1,2};
        System.out.println(sum(arr));
        System.out.println("2nd Way");
        System.out.println(oversum(arr));
    }
}
