//printStackTrace
public class Stacktrace
{
public static void main(String[] s)
{
	try
	{
		y();
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void y()

	{
	z();
	}
static void z()
{
	int a=21/0;
}
}
