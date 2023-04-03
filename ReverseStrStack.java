import java.io.*;
import java.util.*;
class ReverseStrStack
{
    static String ReverseString(String str)
    {
        char[] ReverseString = new char[str.length()];
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            stack.push(str.charAt(i));
        }
        int i = 0;
        while(!stack.isEmpty())
        {
            ReverseString[i++] = stack.pop();
        }
        return new String(ReverseString);
    }
    public static void main(String[] args)
    {
        String s1 = "Welcome to My Program";
        System.out.println( s1+" reverse string is "+ReverseString(s1));
    }
}