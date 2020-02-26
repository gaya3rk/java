interface AA
{
	void met1();
}
interface BB extends AA
{
	void met2();
	void met3();
}
class x implements BB
{
	public void met1()
	{
		System.out.println("one");
	}
	public void met2()
	{
	System.out.println("two");	
	}
	public void met3()
	{
		System.out.println("three");
	}
	void disp()
	{
		System.out.println("abc");
	}

}
public class inface {
	public static void main(String args[])
	{
		x a= new x();
		a.met1();
		a.met2();
		a.met3();
		a.disp();
	}
	
}
