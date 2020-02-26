
//single inheritance
class A {
	int x;
	int y;
	int get(int p,int q)
	{
		x=p;y=q;
		return(0);
	}
void show()
{
	System.out.println("ghj");
}
}
class B extends A
{
	public static void main(String srgs[])
	{
	//	B a=new B();
		A aa=new A();
		//a.get(5, 6);
		aa.show();
		aa=new B();
		aa.show();
		//a.display();

	}
void show()
{
	//super.show();        //dynamic method dispatcher
	System.out.println("jklio");
}
}