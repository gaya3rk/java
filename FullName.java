
public class FullName 
{
public static void main(String s[])
{
	String a="10";
	int b=(String)a;
	try
	{
		int length=s[0].length()+s[1].length();
		if(length<10)
			return;
		System.out.println("name length should be less than 10 in total.");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("2 command line arguments required.");
	}
	finally
	{
		System.out.println("thank you");
	}
}

}
