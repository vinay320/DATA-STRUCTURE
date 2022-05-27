package Array;

public class Stock {
    static int Stk(int[] arr,int s,int l)
    {
        if (s>=l)
        {
            return 0;
        }
        int p=0;
        for (int i = s; i <l ; i++) {
            for (int j = i+1; j <=l ; j++) {
                if (arr[j]>arr[i])
                {
                    int cp=arr[j]-arr[i]+Stk(arr,s,i-1)+Stk(arr,j+1,l);
                    p=Math.max(cp,p);
                }
            }
        }
        return p;
    }
    static int max(int[] arr)
    {
        int n=arr.length;
        int p=0;
        for (int i = 1; i <n ; i++) {
            if (arr[i]>arr[i-1])
            {
                p=p+(arr[i]-arr[i-1]);
            }
        }
        return p;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,5,3,8,12};
        System.out.println(Stk(arr,0,arr.length-1));
        System.out.println("2nd way");
        System.out.println(max(arr));
    }
}
