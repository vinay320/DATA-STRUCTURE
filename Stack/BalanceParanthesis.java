package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceParanthesis

{   static boolean check(char a,char b)
{
    return (a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
}
    static boolean isBalanced(char[] str)
    {
        Stack<Character> s=new Stack<>();
        for (int i = 0; i <str.length ; i++) {
            if(str[i]=='(' || str[i]=='{' || str[i]=='[' )
            {
                s.push(str[i]);
            }
            else
            {
                if(s.empty() || !check(s.peek(), str[i]))
                {
                    return false;
                }
                else
                {
                 s.pop();
                }

            }
        }
        return (s.empty()==true);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isBalanced(str.toCharArray()));
    }
}
