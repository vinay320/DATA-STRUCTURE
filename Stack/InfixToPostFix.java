package Stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFix
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
        for (char c : str) {
            if (Character.isLetterOrDigit(c)) {
                res += c;
            } else if (c == '(') {
                stk.push(c);
            } else if (c == ')') {
                while (stk.peek() != '(') {
                    res += stk.peek();
                    stk.pop();
                }
                stk.pop();
            } else {
                while (!stk.empty() && check(c) <= check(stk.peek())) {
                    res += stk.pop();
                }
                stk.push(c);
            }
        }
        while (!stk.empty())
        {
            if (stk.peek()=='(')
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
        System.out.println(postfix(str.toCharArray()));
    }
}
