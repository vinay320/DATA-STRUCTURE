package Array;
// Remove duplicate from sorted array
public class ArrayDuplicate {
    static int remove(int[] arr,int n)
    {
        int re=1;
        for (int i = 1; i <n ; i++) {
            if(arr[i]!=arr[re-1])
            {arr[re]=arr[i];
                re++;
            }
        }
        return re;
    }
    static void printl(int[] ar,int res)
    {
        for (int i = 0; i < res; i++) {
            System.out.println(ar[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{10,20,20,30,30,30};
        int n=arr.length;
        int res=remove(arr,n);
        printl(arr,res);
    }

}
