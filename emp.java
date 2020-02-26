
public class emp {
		int eno=101;
	 void display()
	{
		//eno=300
		System.out.println(eno);
	}

}
class manager extends emp
{
	void display()
	{
		System.out.println("manager class");
	}
}
class tst
{
	public static void main(String args[])
	{
	manager e=new manager();
	e.display();
	}
}