package Sorting;

public class CountInversion
{
    static int mergesort(int[] arr,int l,int r)
    {   int res=0;
        if(r>l)
        {
            int m=(l+r)/2;
            res+=mergesort(arr,l,m);
            res+=mergesort(arr,m+1,r);
            res+=merge(arr,l,m,r);

        }
        return res;
    }
    static int merge(int[] arr,int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for (int i = 0; i < n1; i++)
        {
            left[i]=arr[i+l];
        }
        for (int i = 0; i <n2 ; i++)
        {
            right[i]=arr[m+i+1];
        }
        int i=0,j=0,k=l;
        int res=0;
        while (i<n1 && j<n2)
        {
            if (left[i] <= right[j])
            {
                arr[k]=left[i];
                i++;
            }
            else
            {
                arr[k]=right[j];
                j++;
                res=res+(n1-i);
            }
            k++;
        }

        while (i<n1)
        {
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<n2)
        {
            arr[k]=right[j];
            j++;
            k++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{21,3,32,4,54};
        System.out.println(mergesort(arr,0,arr.length-1));
    }
}
