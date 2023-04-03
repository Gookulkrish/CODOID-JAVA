import java.io.*;
class reverse 
{
    public static void main (String[] args) {
    String str= "ENVIRONMENT", temp="";
    char ch;
   System.out.print("Given: "+str);     
   for (int i=0; i<str.length(); i++)
	{
        ch= str.charAt(i); 
        temp= ch+temp; 
      }
      System.out.println("\n Reversed: "+ temp);
    }
}