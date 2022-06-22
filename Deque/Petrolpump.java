package Deque;

public class Petrolpump
{
    //first solun
    static int sol1(int[] petrol,int[] dist,int n)
    {
        for (int start = 0; start <n ; start++)
        {
            int curr=0;
            int end=start;
            while (true)
            {
                curr+=(petrol[end]-dist[end]);
                if(curr<0)
                {
                    break;
                }
                end=(end+1)%n;
                if (end==start)
                {
                    return (start + 1);
                }
            }
        }
        return -1;
    }
    // second solution
    static int sol2(int[] petrol,int[] dist,int n)
    {
        int start=0;
        int curr=0;
        int prev=0;
        for (int i = 0; i <n ; i++) {
            curr += (petrol[i] - dist[i]);
            if (curr < 0) {
                start = i + 1;
                prev = curr;
                curr = 0;
            }
        }

         return ((curr+prev)>=0)?(start+1):-1;

    }
    public static void main(String[] args) {
        int[] petrol=new int[]{4,8,7,4};
        int[] dist=new int[]{6,5,3,5};
        System.out.println(sol1(petrol,dist,4));
        System.out.println(sol2(petrol,dist,4));
    }
}
