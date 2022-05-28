package Array;



public class PrefixRange
{
    static int check(int[] arr,int[] l,int[] r)
    {
        for (int i = 0; i <l.length ; i++)
        {
            arr[l[i]]++;
            arr[r[i]-1]--;

        }
        int max=arr[0];
        int res=0;
        for (int i = 1; i <r.length+1; i++) {
            arr[i]+=arr[i-1];
            if (max<arr[i])
            {
                max=arr[i];
                res=i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] l=new int[]{1,2,3};
        int[] r=new int[]{3,5,7};
        int[] arr=new int[100];
        System.out.println(check(arr,l,r));
    }
}
