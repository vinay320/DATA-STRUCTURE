package Sorting;

import java.util.Arrays;

public class MaxGuestProblem
{
    static int max(int[] arr,int[] dep)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1;
        int j=0;
        int res=1;
        int curr=1;
        while (i<arr.length && j<dep.length)
        {
            if (arr[i]<=dep[j])
            {
                curr++;
                i++;
            }
            else
            {
                curr--;
                j++;
            }
            res=Math.max(res,curr);
        }
        return  res;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{900,600,700};
        int[] dep=new int[]{1000,800,730};
        System.out.println(max(arr,dep));
    }
}
