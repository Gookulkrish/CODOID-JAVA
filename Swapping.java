import java.io.*;
class Swapping
{
    public static void main(String[] args)
    {
        int n1 = 50;
        int n2 = 40;
        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;
        System.out.println("Number 1 is "+n1);
        System.out.println("Number 2 is "+n2);
    }
}