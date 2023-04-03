import java.io.*;
import java.util.*;
class RemoveDuplicate
{

    public static void main(String[] args)
    {
        int elements[] =  {23,45,34,87,87,98,23,45,80,12,30};
        int index = 0;
        int len = elements.length;
        int[] temp = new int[len];
        Arrays.sort(elements);
        for(int i=0;i<len-1;i++)
        {
            if(elements[i] != elements[i+1] && i < len-1)
            {
                temp[index]=elements[i];
                index += 1;
            }
            
        }
        for(int element: temp)
        {
            System.out.println(element);
        }
      
    }
}