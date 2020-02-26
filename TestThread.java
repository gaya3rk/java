class TwoStrings
{
	synchronized static void print(String str1,String str2)
	{
		System.out.print(str1);
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{	
		}
		System.out.println(str2);
	}
}
class PrintStringsThread implements Runnable
{
	Thread td;
	String str1,str2;
	PrintStringsThread(String str1,String str2)
	{
		this.str1=str1;
		this.str2=str2;
		td=new Thread(this);
		td.start();
	}
	public void run()
	{
		TwoStrings.print(str1, str2);
	}
}
public class TestThread 
{
public static void main(String args[])
{
new PrintStringsThread("hello"," there");
new PrintStringsThread("how are ","you");
new PrintStringsThread("thank"," U");
}
}
