package Array;

public class LeaderArray {
    static void Lead(int[] arr)
    {
        int n=arr.length;
        int c=arr[n-1];
        System.out.println(c);
        for (int i = n-2; i >=0 ; i--) {
            if (c<arr[i])
            {
                c=arr[i];
                System.out.println(c);
            }
        }

    }
    public static void main(String[] args) {
        int[] arr=new int[]{7,10,4,3,6,5,2};
        Lead(arr);
    }
}
