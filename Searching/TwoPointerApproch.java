package Searching;
// For sorted Array
public class TwoPointerApproch {
    static boolean Second(int[] arr, int x)
    {   int n=arr.length;
        int left=0;
        int right=n-1;
        while (left<right){
            if (arr[left]+arr[right]>x)
            {   right--;
            }
            else if(arr[left]+arr[right]<x)
            {   left++;
            }
            else
            {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{5,10,20,25,37,50};
        int x=55;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                if (arr[i]+arr[j]==x)
                {
                    System.out.println(arr[i]+"  "+arr[j]);
                }
            }
        }

        System.out.println("2nd Approch");
        System.out.println(Second(arr,x));

    }
}
