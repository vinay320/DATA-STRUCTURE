package Recursion;
//sum subset

public class REcu13 {
    static int fun(int[] arr,int n,int sum)
    {
        if (n==0)
        {
            return (sum==0)?1:0;
        }
        return fun(arr,n-1,sum) + fun(arr,n-1,sum-arr[n-1]);
    }
    public static void main(String[] args) {
        System.out.println(fun(new int[]{1,2,3,4,5,6,7,8,9},9,13));
    }
}
