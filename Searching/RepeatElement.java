package Searching;

public class RepeatElement {
    static int check(int[] arr, boolean[] vis) {

        for (int i = 0; i < arr.length; i++) {
            if (vis[arr[i]])
            {
                return arr[i];
            }
            else
            {
                vis[arr[i]]=true;
            }
        }
        return -1;
    }

    static int Method2(int[] arr)
    {
        int slow=arr[0];
        int fast=arr[0];
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(slow!=fast);

        slow = arr[0];
        while (slow!=fast)
        {
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }
        public static void main (String[] args){
            int[] arr = new int[]{ 2, 1, 3, 2, 2};
            boolean[] vis = new boolean[arr.length];
            for (int i = 0; i < vis.length; i++) {
                vis[i] = false;
            }
            System.out.println(check(arr,vis));

            System.out.println("Method 2");

            System.out.println(Method2(arr));
        }

}



