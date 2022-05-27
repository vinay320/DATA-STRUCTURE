package Array;

public class MajorityElement
{
    static int Cout(int[] arr)
    {
        int n=arr.length;
        int c;
        int l=n/2;
        for (int i = 0; i <n ; i++) {
            c=1;
            for (int j = i+1; j <n ; j++) {
               if(arr[j]==arr[i])
               {
                   c++;
                   if(c>l)
               {
                   return arr[i];
               }
               }
            }

        }
        return -1;
    }
    static int Me2(int[] arr)
    {
        int n=arr.length;
        int res=0;
        int count=1;
        for (int i = 1; i <n ; i++) {
            if (arr[res]==arr[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            if (count==0)
            {
                res=i;
                count=1;
            }
        }
        count=0;
        for (int j : arr) {
            if (arr[res] == j) {
                count++;

            }
            if (count > n / 2)
                return res;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{8,3,8,4,8};
        System.out.println(Cout(arr));
        System.out.println("2nd Way");
        System.out.println(Me2(arr));
    }
}
