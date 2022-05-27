package Array;

public class TrapingRainWater
{
    static int water(int[] arr)
    {
        int n=arr.length;
        int res=0;
        for (int i = 1; i <n-1 ; i++)
        {
            int lm=arr[i];
            for (int j = 0; j <i ; j++) {
                lm=Math.max(lm,arr[j]);
            }
            int rm=arr[i];
            for (int j = i+1; j <n ; j++) {
                rm=Math.max(rm,arr[j]);
            }
            res=res+(Math.min(lm,rm)-arr[i]);
        }
        return res;
    }

    static int water2(int[] arr)
    {
        int res=0;
        int n=arr.length;
        int[] lm=new int[arr.length];
        int[] rm=new int[arr.length];
        lm[0]=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            lm[i]=Math.max(arr[i],lm[i-1]);
        }
        rm[n-1]=arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rm[i]=Math.max(arr[i],rm[i+1]);
        }
        for (int i = 1; i <n-1 ; i++) {
            res=res+(Math.min(lm[i],rm[i])-1);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{3,0,1,2,5};
        System.out.println(water(arr));
        System.out.println("2nd Way");
        System.out.println(water2(arr));
    }
}
