
public class hello {
	public static void main(String ar[])
	{
		String s1=new String("hello");
		String s2=new String("hello");
		if(s1.contentEquals(s2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
