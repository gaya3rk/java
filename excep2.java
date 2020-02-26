
public class excep2
{
public static void main(String args[])
{
	int a=10,b=0;
	int c[]=new int [5];
	try
	{
	
		System.out.println(a/b);
	}	catch(ArithmeticException aie)
	{
		System.out.println(aie);
	}
try
{
	System.out.println(c[7]);
}

	catch(Exception aie)
	{
		System.out.println(aie);
	}
}
}

