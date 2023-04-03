import java.io.*;
class ConstructorOverload
{
    int id;
    String name;
    ConstructorOverload()
    {
        System.out.println("This is defualt constructor");
    } 
    ConstructorOverload(int i, String n)
    {
        id=i;
        name=n;
    }
    public static void main(String[] args)
    {
        ConstructorOverload s= new ConstructorOverload();
        System.out.println("id "+s.id+" Name "+s.name);
        ConstructorOverload s1= new ConstructorOverload(10,"David");
        System.out.println("id "+s1.id+" Name "+s1.name);
    }
}