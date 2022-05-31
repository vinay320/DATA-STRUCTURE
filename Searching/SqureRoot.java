package Searching;

public class SqureRoot {
    static int root(int num) {
        int start = 0;
        int last = num;
        int mid;
        int res = -1;
        while (start <= last) {
            mid = (start + last) / 2;
            int msq = mid * mid;
            if (msq == num) {
                return mid;
            } else if (msq > num) {
                last = mid - 1;
            } else {
                start = mid + 1;
                res = mid;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        //Method 1st
        int num=9;
        int i=1;
        while (i*i<=num)
        {
            i++;
        }
        System.out.println(i-1);
        System.out.println("Method 2");
        System.out.println(root(num));
    }
}

