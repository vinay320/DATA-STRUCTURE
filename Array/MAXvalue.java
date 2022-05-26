package Array;

public class MAXvalue {
    static int Diff(int[] arr)
    {
        int n=arr.length;
        int res=arr[1]-arr[0];
        int min =arr[0];
        for (int j = 0; j <n ; j++) {

            res=Math.max(res,arr[j]-min);
            min=Math.min(min,arr[j]);

        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{7,10,4,3,6,5,2};
        System.out.println(Diff(arr));
    }
}
