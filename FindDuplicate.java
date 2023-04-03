import java.io.*;
import java.util.*;
class FindDuplicate
{
    public static void main(String[] args)
    {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(10,23,30,23,50,30,10,54,76,43,8,3,6));
        Collections.sort(num);
        for(int i=0;i<num.size();i++)
        {
            if(i < num.size()- 1)
            {
            if(num.get(i) == num.get(i+1))
            {
                System.out.println(num.get(i));
            }
            }
        }
    }
}