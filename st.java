
public class st {
	static int a;
	st(){}
	void disp()
	{
		a++;
		System.out.println(a);
	}
	public static void main(String ar[])
	{
		for(int i=0;i<5;i++)
		{
			st se=new st();
			se.disp();
		}
	}

}
