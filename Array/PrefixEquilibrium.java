package Array;

public class PrefixEquilibrium
{
    static boolean Pre(int[] arr)
    {
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        int lsum=0;
        for (int i = 0; i <arr.length ; i++) {
            if (lsum==sum-arr[i])
            {
                return  true;
            }
            else
            {
                lsum+=arr[i];
                sum-=arr[i];
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{3,4,8,-9,20,6};
        System.out.println(Pre(arr));

    }

}
