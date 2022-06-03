package Stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix
{
    static int check( char a)
    {
        return switch (a) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };

    }
    static String postfix(char[] str)
    {   String res="";
        Stack<Character> stk=new Stack<>();
        for (int i = str.length-1; i>=0 ; i--) {
            if(Character.isLetterOrDigit(str[i]))
            {
                res+=str[i];
            }
            else if(str[i]==')')
            {
                stk.push(str[i]);
            }
            else if(str[i]=='(')
            {
                while (stk.peek()!=')')
                {
                    res+=stk.peek();
                    stk.pop();
                }
                stk.pop();
            }
            else
            {
                while (!stk.empty() && check(str[i])<=check(stk.peek()))
                {
                    res+=stk.pop();
                }
                stk.push(str[i]);
            }
        }
        while (!stk.empty())
        {
            if (stk.peek()==')')
            {
                return "Invalid";
            }
            res+=stk.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ss=postfix(str.toCharArray());
        for (int i =ss.length()-1; i >=0 ; i--) {
            System.out.print(ss.charAt(i));
        }
    }
}
