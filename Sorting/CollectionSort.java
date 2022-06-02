package Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class CollectionSort
{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
