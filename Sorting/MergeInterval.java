package Sorting;

import java.util.Arrays;

class Interval implements Comparable<Interval>
{
    int x,y;
    Interval(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public int compareTo(Interval p)
    {
        return this.x-p.x;
    }
}

public class MergeInterval
{   static int Merge(Interval[] arr, int n)
    {
        Arrays.sort(arr);
        int res=0;
        for (int i = 1; i <n ; i++) {
            if (arr[res].y>=arr[i].x)
            {
                arr[res].y=Math.max(arr[res].y,arr[i].y);
                arr[res].x=Math.min(arr[res].x,arr[i].x);
            }
            else
            {
                res++;
                arr[res]=arr[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {

        Interval[] arrr={new Interval(5,10),new Interval(3,15),new Interval(18,30),new Interval(2,7)};
        int res=Merge(arrr,arrr.length);
        for (int i = 0; i <=res ; i++)
        {
            System.out.println(arrr[i].x+" "+arrr[i].y);
        }
    }
}
