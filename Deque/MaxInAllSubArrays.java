package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class MaxInAllSubArrays
{

    //Naive method
    static void check(int[] arr,int k) {

        for (int i = 0; i < arr.length-k+1; i++) {
            int max = arr[i];
            for (int j = i+1; j <i+k; j++) {
                if (arr[j] >= max) {
                    max = arr[j];
                }
            }
            System.out.print(max+" ");
        }
    }
    // Better Approch
    static void check2(int k ,int[] arr)
    {
       Deque<Integer> d=new LinkedList<>();
        for (int i = 0; i <k ; i++) {
            while (!d.isEmpty() && arr[i]>=arr[d.peekLast()])
            {
                d.removeLast();
            }
            d.addLast(i);
        }
        for (int i = k; i <arr.length ; i++) {
            System.out.print(arr[d.peek()]+" ");
            while (!d.isEmpty() && d.peek()<i-k)
            {
                d.removeFirst();
            }
            while (!d.isEmpty() && arr[i]>=arr[d.peekLast()])
            {
                d.removeLast();
            }
            d.addLast(i);
        }
        System.out.print(arr[d.peek()]+" ");
    }
    public static void main(String[] args) {
        int[] arr=new int[]{10,8,5,12,15,7,6};
      check(arr,3);
        System.out.println();
      check2(3,arr);
    }
}
