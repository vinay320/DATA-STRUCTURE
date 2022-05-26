package Array;

//Rearrange an array such that arr[i] = i
public class RearrageArr {

    // Approch 1
    static void ReArr(int[] arr)
    { int n=arr.length;

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(arr[j]==i)
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    break;
                }
            }
        }
        for (int i = 0; i <n ; i++) {
            if(arr[i]!=i)
            {
                arr[i]=-1;
            }
        }

        for (int i = 0; i <n ; i++) {
            System.out.print(" "+arr[i]);
        }

    }

    // Aprroch 2
    static void ReArr2(int[] arr)
    {
        for (int i = 0; i < arr.length;)
        {
            if (arr[i] >= 0 && arr[i] != i)
            {
                int ele = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = ele;
            }
            else
            {
                i++;
            }
        }
        System.out.println("\nSecond");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        int n, arr[] = { -1, -1, 6, 1, 9,3, 2, -1, 4, -1 };
        ReArr(arr);
        int arr1[] = { -1, -1, 6, 1, 9,3, 2, -1, 4, -1 };
        ReArr2(arr1);
    }
}
