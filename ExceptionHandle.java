import java.io.*;
class ExceptionHandle
{
    static int method()
    {
        try{
            System.out.println("Try Block");
            return 10;
        }
        finally
        {
            System.out.println("FinallyBlock");
        }
    }
    public static void main(String[] args)
    {
        System.out.println(method());
    }   
}