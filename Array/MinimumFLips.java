package Array;

public class MinimumFLips {
    static void flip(int[] arr)
    {
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]!=arr[i-1]) {
                if (arr[i]!=arr[0]) {
                    System.out.println("from " + i + " to ");
                }
            else
                {
                    System.out.print(i - 1+"\n");
                }
            }
        }
        if (arr[arr.length-1]!=arr[0])
        {
            System.out.print(arr.length-1);
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{0,0,1,1,0,0,1,1,0,1};
        flip(arr);
    }
}
