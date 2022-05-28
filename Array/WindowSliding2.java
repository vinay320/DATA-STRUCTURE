package Array;

public class WindowSliding2 {

    static boolean suma(int[] arr, int sum)
    {   int currs=arr[0];
        int s=0;
        for (int i = 1; i < arr.length ; i++)
        {
            while (currs>sum && s<i-1)
            {
                currs-=arr[s];
                s++;
            }
            if (currs==sum)
            {
                return true;
            }
            if(i<arr.length)
            {
                currs+=arr[i];
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,8,30,5,20,7};
        int sum=55;
        System.out.println(suma(arr,sum));

    }
}
