package Array;

public class MOVEzero {
    static void Zero(int[] arr)
    {
        int c=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=0)
            {
                int tmp=arr[i];
                arr[i]=arr[c];
                arr[c]=tmp;
                c++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{10,3,0,1,50,0,4,0,55,0};
        Zero(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
