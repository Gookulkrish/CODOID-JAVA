import java.io.*;
class EnumerationExp
{
    enum level{
        LOW ,
        MEDIUM,
        HIGH 
    }
    public static void main(String[] args)
    {
        level myQuality = level.HIGH;
        System.out.println(myQuality+" Level");
    }
}