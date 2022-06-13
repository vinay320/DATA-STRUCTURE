package String;

public class FreqOfCharcters
{
    public static void main(String[] args) {
     String str="hellowrold";
        System.out.println(str);
        int[] arr=new int[26];
        for (int i = 0; i <str.length(); i++) {
            arr[str.charAt(i)-'a']++;
        }
        for (int i = 0; i <26 ; i++) {
            if (arr[i]>0)
            {
                System.out.println((char)(i+'a')+" "+arr[i]);
            }
        }


    }
}
