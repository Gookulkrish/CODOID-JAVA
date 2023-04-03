import java.io.*;
import java.util.*;
class BreakContinue
{
    public static void  main(String[] args)
    {
        int i = 1;
        while(i<10)
        {
            if(i == 4)
            {
                i +=2;
                continue;
            }
            else if(i == 6)
            {
                System.out.println("The condition is true break the loop");
                break;
            }
            i +=1;
        }
    } 
}