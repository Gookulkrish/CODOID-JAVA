import java.util.Arrays;   
public class sort 
{   
public static void main(String[] args)   
{     
int[] array = new int[] {1,2,3,55,88,0,6,7,625};    
Arrays.sort(array);   
System.out.println("Ordered Array: ");  
for (int i = 0; i < array.length; i++)   
{       
System.out.println(array[i]);   
}   
}  
}