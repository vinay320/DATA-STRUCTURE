package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Mycmp implements Comparable<Mycmp>
{
    int x,y;
    Mycmp(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public int compareTo(Mycmp p)
    {
        return this.x-p.x;
    }

}
public class CollectionSortComparable
{
    public static void main(String[] args) {
        List<Mycmp> list=new ArrayList<>();
        list.add(new Mycmp(3,4));
        list.add(new Mycmp(45,78));
        list.add(new Mycmp(1,8));
        Collections.sort(list);
        for (Mycmp str: list)
        {
            System.out.println(str.x+ " "+str.y);
        }
    }
}
