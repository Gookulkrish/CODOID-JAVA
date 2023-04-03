class developer
{
	public final void job()
	{
				System.out.println("\n C C++ JAVA \n");
	}
	public void salary()
	{
				System.out.println("\n 8 LPA \n");
	}
}
class tester extends developer
{
	public void job()
	{
				System.out.println("\n Manual Selenium API Networking Powershell Active Directory \n");
	}
	public void salary()
	{
				System.out.println("\n 6 LPA \n");
	}
}
class overriding
{
	public static void main(String args[])
	{
		tester Test = new tester();
		Test.job();
		Test.salary();
	}
}