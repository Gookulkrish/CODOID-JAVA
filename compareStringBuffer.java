import java.io.*;
class CompareStringBuffer
{
    public static void main(String[] args)
    {
        String str = "Apple";
        StringBuffer st=new StringBuffer();
        st.append("Apple");
        boolean result = str.contentEquals(st);
        if(result)
        {
            System.out.println("Comparison true");
        }
        else
        {
            System.out.println("Comparison false");
        }
    }
}