import java.io.*;
import java.util.*;
class Stars
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many Number of stars print ");
        int count = sc.nextInt();
        for(int i=0;i<count;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }     
    }
}