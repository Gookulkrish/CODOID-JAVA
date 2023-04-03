import java.io.*;
class Animal{
    void eat(){
        System.out.println("Method overloading call from base class");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Method overloading call from derived class");
    }
}
class MethodOverloadOverride
{
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
        System.out.println("Method Override with 2 parameter "+add(4,5));
        System.out.println("Method Override with 3 parameter "+add(4,5,7));
        Animal animal = new Dog();
        animal.eat();

    }
}