package Sorting;

import java.util.Arrays;
class Point implements Comparable<Point>
{
    int x,y;
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public int compareTo(Point p)
    {
        return this.x-p.x;
    }
}

public class Sorting1
{
    public static void main(String[] args) {
        int[] arr=new int[]{8,3,8,4,8};
        char[] arr1=new char[]{'A','d','w','a','q'};
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i] +" "+arr1[i]);
        }
        System.out.println("New");
        Point[] arrr={new Point(3,2),new Point(45,3),new Point(44,66)};
        Arrays.sort(arrr);
        for (int i = 0; i <arrr.length ; i++)
        {
            System.out.println(arrr[i].x+" "+arrr[i].y);
        }

    }
}
