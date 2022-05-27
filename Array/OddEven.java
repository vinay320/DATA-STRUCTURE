package Array;

public class OddEven
{
    static int length(int[] arr)
    {
        int n=arr.length;
        int res=1;
        for (int i = 0; i <n ; i++) {
            int curr=1;
            for (int j = i+1; j <n ; j++) {
                if ((arr[j]%2==0 && arr[j-1]%2!=0)||(arr[j]%2!=0 && arr[j-1]%2==0))
                {
                    curr++;
                }
                else
                {
                    break;
                }
            }
            res=Math.max(res,curr);
        }
        return res;
    }
    static int mehthod2(int[] arr)
    {
        int n=arr.length;
        int res=1;
        int curr=1;
        for (int j = 1; j <n ; j++) {
            if ((arr[j]%2==0 && arr[j-1]%2!=0)||(arr[j]%2!=0 && arr[j-1]%2==0))
            {
                curr++;
                res=Math.max(curr,res);
            }
            else
            {
                curr=1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2,3,56,4,3,54,3,2,3,2,3,5,6};
        System.out.println(length(arr));
        System.out.println("2nd Way");
        System.out.println(mehthod2(arr));
    }
}
