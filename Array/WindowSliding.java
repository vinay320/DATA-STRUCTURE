package Array;

public class WindowSliding {

    static int get(int[] arr,int k)
    {
        int n=arr.length;
        int csum=0;
        for (int i = 0; i <k ; i++) {
            csum+=arr[i];
        }
        int cmx=csum;
        for (int i = k; i <n ; i++) {
            csum=csum+arr[i]-arr[i-k];
            cmx=Math.max(cmx,csum);
        }
        return cmx;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,8,30,-5,20,7};
        //Normal way
        int c;
        int k=3;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i +k-1<arr.length; i++) {
            c=0;
            for (int j = 0; j <k; j++) {
              c+=arr[i+j];
            }
            max=Math.max(max,c);
        }
        System.out.println(max);
        System.out.println("2nd way");
        System.out.println(get(arr,k));
    }
}
