import java.io.*;
class NullPointerExp
{
    public static void main(String[] args)
    {
        Object obj = null;
        String data;
        try{
          data  = obj.toString();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}