package Stack;

import java.util.ArrayList;

public class ArraylistImplimentation {
    ArrayList<Integer> al = new ArrayList<>();

    void push(int x) {
        al.add(x);
    }

    void pop() {

        if (isempty()) {
            System.out.println("Empty");

        } else {
            int res = al.get(al.size() - 1);
            al.remove(al.size() - 1);
            System.out.println(res);
        }
    }


    int peek()
    {
        if (isempty())
        {
            return -1;
        }
        return al.get(al.size()-1);
    }
    boolean isempty()
    {
        return al.isEmpty();
    }
    int size()
    {
        return al.size();
    }
    public static void main(String[] args) {
        ArraylistImplimentation s=new ArraylistImplimentation();
        s.push(5);
        System.out.println(s.peek());
        s.push(78);
        System.out.println(s.size());
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.size());
        System.out.println(s.peek());

    }
}
