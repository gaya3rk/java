class AAA
{
	int x=1000;
	void AAA()
	{
		System.out.println("A");
	}
}
class BBB extends AAA
{
		void BBB()
	{
		System.out.println("B");
	}
}
public class samp {
	public static void main(String args[])
	{
		BBB obj=new BBB();
		obj.AAA();
		obj.BBB();
	}

}
