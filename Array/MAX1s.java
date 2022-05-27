package Array;

public class MAX1s
{
    static int count(int[] arr)
    {
        int n=arr.length;
        int c=0;
        int max=0;
        for (int i = 0; i <n ; i++) {
            if (arr[i] == 1) {
                c++;
            } else
            {
                max = Math.max(c, max);
                c = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,1,0,1,0,1,1,1,0,1};
        System.out.println(count(arr));
    }
}
