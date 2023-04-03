import java.util.*;
class A
{
	final int add(int a,int b)
	{
		return a+b;
	}
}
class B extends A
{	
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	void display()
	{
		System.out.println("Enter Number");
	}
	void res(int res)
	{
		System.out.println("Addition of Numbers is "+res);
	}
}
class overloading
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Digits to count(2-3)");
		int opt=sc.nextInt();
		B obj=new B();
		switch (opt)
		{
			case 2:{
					obj.display();
					int num1=sc.nextInt();
					obj.display();
					int num2=sc.nextInt();
					int res = obj.add(num1,num2);
					obj.res(res);
					break;
					}
			case 3:{
					obj.display();
					int num1=sc.nextInt();
					obj.display();
					int num2=sc.nextInt();
					obj.display();
					int num3=sc.nextInt();
					int res = obj.add(num1,num2,num3);
					obj.res(res);
					break;
					}	
			default:{
					System.out.println("Out of My Range to Add Sorry !!!!!!");
					break;
					}				
		}		
	}
}